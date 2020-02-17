package CaseStudy.Commons;

import CaseStudy.Models.Villa;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class FunWriteAndReadFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final String pathVilla = "src/CaseStudy/Data/Villa.csv";
    private static String[] headerRecordVilla = new String[]{"id","areaUsed","nameService","maxNumberOfPeople","typeRent",
    "roomStandard","convenientDescription","areaPool","numberOfFloors"};
    private static final String[] headerRecordHouse = new String[]{"id","areaUsed","nameService","maxNumberOfPeople","typeRent",
            "roomStandard","convenientDescription","areaPool","numberOfFloors"};
    public static void writeVillaToFilesCSV(ArrayList<Villa> arrayList){
            try (Writer writer = new FileWriter(pathVilla);
            CSVWriter csvWriter = new CSVWriter(writer,CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END)){
                csvWriter.writeNext(headerRecordVilla);
                for (Villa villa : arrayList){
                    csvWriter.writeNext(new String[]{
                        villa.getId(),villa.getNameService(),
                        String.valueOf(villa.getareaUsed()),
                        String.valueOf(villa.getNameService()),
                        String.valueOf(villa.getMaxNumberOfPeople()),
                        villa.getTypeRent(),villa.getRoomStandard(),villa.getConvenientDescription(),
                        String.valueOf(villa.getAreaPool()),
                        String.valueOf(villa.getNumberOfFloors())
                    });
                }
            }catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
