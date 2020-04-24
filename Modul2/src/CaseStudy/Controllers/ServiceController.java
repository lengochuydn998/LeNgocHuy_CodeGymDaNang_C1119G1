package CaseStudy.Controllers;

import CaseStudy.Commons.FunValidation;
import CaseStudy.Commons.FuncGeneric;
import CaseStudy.Commons.FuncWriteAndReadFileCSV;
import CaseStudy.Commons.ScannerUtils;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Services;
import CaseStudy.Models.Villa;
import com.sun.org.apache.xpath.internal.functions.FuncGenerateId;
import com.sun.org.apache.xpath.internal.functions.FuncUnparsedEntityURI;

import java.util.ArrayList;

import static CaseStudy.Commons.FuncGeneric.displayList;
import static CaseStudy.Commons.Menu.displayMenuAddNewService;
import static CaseStudy.Commons.Menu.displayMenuShowService;
import static CaseStudy.Controllers.MainController.backMainMenu;
import static CaseStudy.Controllers.MainController.processMain;

public class ServiceController {
    public static final String ENTER_SERVICE_ID = "Enter Service ID :";
    public static final String INVALID_SERVICE_ID = "Service ID id is format SVXX-YYYY";
    public static final String ENTER_SERVICE_NAME = "Enter Name Service ";
    public static final String INVALID_SERVICE_NAME = " Name Service if format Xabcxyz :";
    public static final String ENTER_AREA_USED = "Enter Area Used :";
    public static final String INVALID_DOUBLE_NUMBER = "Area >30 Area must be a double";
    public static final String ENTER_RENTAL_COSTS = "Enter Rental Costs :";
    public static final String INVALID_RENTAL_COST = "Cost >0 and must be a double:";
    public static final String ENTER_MAX_NUMBER_OF_PEOPLE = "Enter Max Number Of People :";
    public static final String INVALID_MAX_PEOPLE = "Number Of People >0 and Max <20 :";
    public static final String ENTER_TYPE_RENT = "Enter Type Rent :";
    public static final String INVALID_TYPE_RENT = "Service is invalid :";
    public static final String ENTER_ROOM_STANDARD = "Enter Room Standard :";
    public static final String INVALID_ROOM_STANDARD = "Invalid :";
    public static final String ENTER_AREA_POOL = "Enter AreaPool :";
    public static final String INVALID_AREA_POOL = "Area >30 :";
    public static final String ENTER_NUMBER_OF_FLOORS = "Enter Number Of Floors :";
    public static final String INVALID_NUMBER_OF_FLOORS = "Number Of Floors >0 :";
    public static final String ENTER_FREE_SERVICE = "Enter Free Service :";
    public static final String INVALID_FREE_SERVICE = "Free Service equal massage food karaoke drink or car ";
    public static void addNewService(){
        displayMenuAddNewService();
        processMenuAddNewService();
    }
    public static void processMenuAddNewService(){
        switch (ScannerUtils.scanner.nextLine()){
            case "1":
                addNewVilla();
                break;
            case "2" :
                addNewHouse();
                break;
            case "3":
                addNewRoom();
                break;
            case "4":
                processMain();
                System.out.println("\n----------------------");
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("----Nhap sai hien thi lai menu");
                backMainMenu();
        }
    }
    public static void addNewVilla(){
        Services villa = new Villa();
        villa = addNewService(villa);


        ((Villa) villa).setRoomStandard(FunValidation.getValidName(ENTER_ROOM_STANDARD,INVALID_ROOM_STANDARD));

        ((Villa) villa).setAreaPool(FunValidation.getValidNumberDouble(ENTER_AREA_POOL,INVALID_AREA_POOL,30.0));

        ((Villa) villa).setNumberOfFloors(FunValidation.getValidNumberInteger(ENTER_NUMBER_OF_FLOORS,INVALID_NUMBER_OF_FLOORS,0));

        ((Villa)villa).setConvenientDescription(ScannerUtils.scanner.nextLine());

        //Get List Villa From CSV
        ArrayList<Villa> villaList = FuncGeneric.getListFromCVS(FuncGeneric.EntityType.VILLA);
        //Add Villa To List
        villaList.add((Villa)villa);
        //Write To CSV
        FuncWriteAndReadFileCSV.writeVillaToFileCsv(villaList);

        System.out.println("----- Add Villa"+villa.getServiceName()+"Successfully");
        backMainMenu();
    }
    public static void addNewHouse(){
        Services house = new House();
        house = addNewService(house);

        ((House) house).setRoomStandard(FunValidation.getValidName(ENTER_ROOM_STANDARD,INVALID_ROOM_STANDARD));

        ((House) house).setConvenientDescription(ScannerUtils.scanner.nextLine());

        ((House) house).setNumberOfFloors(FunValidation.getValidNumberInteger(ENTER_NUMBER_OF_FLOORS,INVALID_NUMBER_OF_FLOORS,0));

        //Get List House From CSV
        ArrayList<House> houseList = FuncGeneric.getListFromCVS(FuncGeneric.EntityType.HOUSE);
        //Add House To List
        houseList.add((House) house);
        //Write To CSV
        FuncWriteAndReadFileCSV.writeHouseToFileCsv(houseList);
        System.out.println("----- Add House "+house.getServiceName()+" Successfully");
        backMainMenu();
    }
    public static void addNewRoom(){
        Services room = new Room();
        room = addNewService(room);

        ((Room) room).setFreeService(FunValidation.getValidFreeService(ENTER_FREE_SERVICE,INVALID_FREE_SERVICE));

        //Get List House From CSV
        ArrayList<Room> roomList = FuncGeneric.getListFromCVS(FuncGeneric.EntityType.ROOM);
        //Add House To List
        roomList.add((Room) room);
        //Write To CSV
        FuncWriteAndReadFileCSV.writeRoomToFileCsv(roomList);
        System.out.println("----- Add Room "+room.getServiceName()+" Successfully");
        backMainMenu();
    }
    private static Services addNewService(Services services){
        services.setId(FunValidation.getValidIdService(services, ENTER_SERVICE_ID,INVALID_SERVICE_ID));

        services.setServiceName(FunValidation.getValidName(ENTER_SERVICE_NAME,INVALID_SERVICE_NAME));

        services.setAreaUsed(FunValidation.getValidNumberDouble(ENTER_AREA_USED,INVALID_DOUBLE_NUMBER,30.0));

        services.setRentalCosts(FunValidation.getValidNumberDouble(ENTER_RENTAL_COSTS,INVALID_RENTAL_COST,0.0));

        services.setMaxNumberOfPeople(FunValidation.getValidNumberInteger(ENTER_MAX_NUMBER_OF_PEOPLE,INVALID_MAX_PEOPLE,0,20));

        services.setRentType(FunValidation.getValidName(ENTER_TYPE_RENT,INVALID_TYPE_RENT));

        return services;
    }
    public static void showServices(){
        displayMenuShowService();
        processMenuShowService();
    }
    public static void processMenuShowService(){
        switch (ScannerUtils.scanner.nextLine()){
            case "1":
                showVilla();
                break;
            case "2":
                showHouse();
                break;
            case "3":
                showRoom();
                break;
            case "4":
                showAllNameVilla();
                break;
            case "5":
                showAllNameHouse();
                break;
            case "6":
                showAllNameRoom();
                break;
            case "7":
                processMain();
                System.out.println("---------------");
                break;
            case "8":
                System.exit(0);
            default:
                System.out.println("---- Nhap Sai Hien Thi Lai Menu ----");
                backMainMenu();
                break;
        }
    }

    private static void showAllNameRoom() {
    }

    private static void showAllNameHouse() {
    }

    private static void showAllNameVilla() {
    }

    private static void showRoom() {
        ArrayList<Room> roomList = FuncGeneric.getListFromCVS(FuncGeneric.EntityType.ROOM);
        displayList(roomList);
        backMainMenu();
    }

    private static void showHouse() {
        ArrayList<House> houseList = FuncGeneric.getListFromCVS(FuncGeneric.EntityType.HOUSE);
        displayList(houseList);
        backMainMenu();
    }

    private static void showVilla(){
        ArrayList<Villa> villaList = FuncGeneric.getListFromCVS(FuncGeneric.EntityType.VILLA);
        displayList(villaList);
        backMainMenu();
    }
}
