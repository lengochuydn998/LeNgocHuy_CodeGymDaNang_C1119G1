package CaseStudy.Commons;

import CaseStudy.Models.Customer;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class FuncWriteAndReadFileCSV {
    // the delimiter to use for separating entries
    public static final char DEFAULT_SEPARATOR = ',';
    //  the character to use for quoted elements
    public static final char DEFAULT_QUOTE = '"';
    // the line number to skip for start reading
    public static final int NUM_OF_LINE_SKIP = 1;
    // path file villa
    public static final String pathVilla = "src/CaseStudy/Data/Villa.csv";
    // path file house
    public static final String pathHouse = "src/CaseStudy/Data/House.csv";
    // path file room
    public static final String pathRoom  = "src/CaseStudy/Data/Room.csv";
    // path file Customer
    public static final String pathCustomer = "src/CaseStudy/Data/Customer.csv";
    // path file booking
    public static final String pathBooking = "src/CaseStudy/Data/Booking.csv";
    //path file Employee
    public static final String pathEmployee = "src/CaseStudy/Data/Employee.csv";
    //header Villa.csv
    public static String[] headerRecordVilla = new String[] {"id","serviceName","areaUsed","rentalCosts","maxNumberOfPeople","rentType","roomStandard","convenientDescription","areaPool","numberOfFloors"};
    //header Room.csv
    public static String[] headerRecordRoom = new String[]{"id","serviceName","areaUsed","rentalCosts","maxNumberOfPeople","rentType","freeService"};
    //header House.csv
    public static String[] headerRecordHouse = new String[]{"id","serviceName","areaUsed","rentalCosts","maxNumberOfPeople","rentType","roomStandard","convenientDescription","numberOfFloors"};
    //header Employee.csv
    public static String[] headerRecordEmployee = new String[]{"id","fullName","age","address"};
    //header Customer.csv
    public static String[] headerRecordCustomer = new String[]{"fullName","birthday","gender","idCard","phone","email","customerType","address"};
    //header Booking
    public static String[] headerRecordBooking = new String[]{"fullName","birthday","gender","idCard","phone","email"
            ,"customerType","address","id","serviceName","areaUsed","rentalCosts","maxNumberOfPeople","rentType"};
    //function write  villa to csv
    public static void writeVillaToFileCsv(ArrayList<Villa> arrayList){
        try (Writer writer = new FileWriter(pathVilla);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END);){
            csvWriter.writeNext(headerRecordVilla);
            for (Villa villa :arrayList){
                csvWriter.writeNext(new String[]
                        {villa.getId(),villa.getServiceName(),String.valueOf(villa.getAreaUsed()),String.valueOf(villa.getRentalCosts()),String.valueOf(villa.getMaxNumberOfPeople()),
                        villa.getRentType(),villa.getRoomStandard(),villa.getConvenientDescription(),String.valueOf(villa.getAreaPool()),String.valueOf(villa.getNumberOfFloors())});
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    //function write house to csv
    public static void writeHouseToFileCsv(ArrayList<House> arrayList){
        try (Writer writer = new FileWriter(pathHouse);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END);){
            csvWriter.writeNext(headerRecordHouse);
            for (House house :arrayList){
                csvWriter.writeNext(new String[]
                        {house.getId(),house.getServiceName(),String.valueOf(house.getAreaUsed()),String.valueOf(house.getRentalCosts()),String.valueOf(house.getMaxNumberOfPeople()),
                                house.getRentType(),house.getRoomStandard(),house.getConvenientDescription(),String.valueOf(house.getNumberOfFloors())});
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    //function write room to csv

    public static void writeRoomToFileCsv(ArrayList<Room> arrayList){
        try (Writer writer = new FileWriter(pathRoom);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END);){
            csvWriter.writeNext(headerRecordHouse);
            for (Room room :arrayList){
                csvWriter.writeNext(new String[]
                        {room.getId(),room.getServiceName(),String.valueOf(room.getAreaUsed()),String.valueOf(room.getRentalCosts()),String.valueOf(room.getMaxNumberOfPeople()),
                                room.getRentType(),room.getFreeService()});
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    //function write customer to csv
    public static void writeCustomerToFileCsv(ArrayList<Customer> arrayList){
        try (Writer writer = new FileWriter(pathCustomer);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.DEFAULT_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END);){
            csvWriter.writeNext(headerRecordHouse);
            for (Customer customer :arrayList){
                csvWriter.writeNext(new String[]
                        {customer.getFullName(),customer.getBirthday(),customer.getGender(),String.valueOf(customer.getIdCard()),String.valueOf(customer.getPhone()),
                                customer.getEmail(),customer.getCustomerType(),customer.getAddress(),customer.getServices()});
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
