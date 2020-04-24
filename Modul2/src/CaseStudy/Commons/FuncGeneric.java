package CaseStudy.Commons;

import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static CaseStudy.Commons.FuncWriteAndReadFileCSV.*;

public class FuncGeneric {
    public enum EntityType {
        VILLA,
        HOUSE,
        ROOM,
        CUSTOMER,
        EMPLOYEE
    }
    public static <E> void displayList(ArrayList<E> list){
        int i=1;
        System.out.println("---------LIST--------");
        for (E item:list) {
            System.out.println("No "+i);
            if (item instanceof Villa){
                ((Villa) item).showInfo();
            }
            else if (item instanceof  House){
                ((House) item).showInfo();
            }
            else if (item instanceof Room){
                ((Room) item).showInfo();
            }
//            else if (item instanceof Customer){
//                ((Customer) item).showInfo();
//            }
//            else if (item instanceof Employee) {
//                System.out.println(((Emplpyee) item));
//            }
            i ++;
            System.out.println("---------------------");
        }
    }

    public static <E> ArrayList<E> getListFromCVS(EntityType entityType) {
        String csvPath = "";
        String[] headerRecord;
        switch (entityType) {
            case VILLA:
                csvPath = pathVilla;
                headerRecord = headerRecordVilla;
                break;
            case HOUSE:
                csvPath = pathHouse;
                headerRecord = headerRecordHouse;
            case ROOM:
                csvPath = pathRoom;
                headerRecord = headerRecordRoom;
                break;
            case CUSTOMER:
                csvPath = pathCustomer;
                headerRecord = headerRecordCustomer;
                break;
            case EMPLOYEE:
                csvPath = pathEmployee;
                headerRecord = headerRecordEmployee;
                break;
            default:
                throw new IllegalStateException("Unexpected value " + entityType);
        }
        Path path = Paths.get(csvPath);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(csvPath);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        ColumnPositionMappingStrategy<E> strategy = new ColumnPositionMappingStrategy<>();
        switch (entityType) {
            case VILLA:
                strategy.setType((Class<? extends E>) Villa.class);
                break;
            case HOUSE:
                strategy.setType((Class<? extends E>) House.class);
                break;
            case ROOM:
                strategy.setType((Class<? extends E>) Room.class);
            case CUSTOMER:
//                strategy.setType((Class<? extends E>) Customer.class);
                break;
            case EMPLOYEE:
//                strategy.setType((Class<? extends E>) Employee.class);
                break;
            default:
        }
        strategy.setColumnMapping(headerRecord);
        CsvToBean<E> csvToBean = null;
        try{
            csvToBean = new CsvToBeanBuilder<E>(new FileReader(csvPath))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return (ArrayList<E>) csvToBean.parse();
    }

}
