package CaseStudy.Controllers;

import CaseStudy.Commons.FunWriteAndReadFileCSV;
import CaseStudy.Models.Services;
import CaseStudy.Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainController {
    private static Scanner sc = new Scanner(System.in);
    public static void displayMainMenu(){
        System.out.println("1.Add New Services"
        +"\n2.Show Services"+"\n3.Exit"
        +"\nPlease select one function below");
        switch (sc.nextInt()){
            case 1 :
                addNewService();
            case 2 :
                showService();
            case 3 :
                System.exit(0);
            default:
                System.out.println("\nError.Back To Menu.");
                backMainMenu();
        }
    }
    private static void backMainMenu(){
        System.out.println("\nEnter to continue...");
        sc.nextLine();
        System.out.println("\n---------------------");
        displayMainMenu();
    }
    private static void addNewService(){
        System.out.println("\n------------");
        System.out.println("1.Add New Villa"+"\n2.Add New House"+"\n3.Add New Room"+
                "\n4.Back To Menu"+"\n5.Exit"+
                "\nPlease select one function below !!");
        switch (sc.nextInt()){
            case 1:
                addNewVilla();
            case 2:
                addNewHouse();
            case 3 :
                addNewRoom();
            case 4:
                displayMainMenu();
                System.out.println("\n---------------");
            case 5:
                System.exit(0);
            default:
                System.out.println("\nError. Back To Menu");
                backMainMenu();
        }
    }
    private static void showService(){
        System.out.println("\n---------------" +
                "\n1.Show all Villa"+
                "\n2.Show all House"+
                "\n3.Show all Room"+
                "\n4.Bach To Menu"+
                "\n5.Exit."+
                "\nPlease select one function below :");
        switch (sc.nextInt()){
            case 1 :
                showAllVilla();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
            case 4 :
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
                backMainMenu();
        }
    }
    private static void showAllVilla(){}
    private static void showAllHouse(){}
    private static void showAllRoom(){}
    private static Services addNewService(Services services){
        services.setId(UUID.randomUUID().toString().replace("-",""));
        sc.nextLine();
        System.out.println("Enter name services");
        services.setNameService(sc.nextLine());
        System.out.println("Enter area pool");
        services.setareaUsed(sc.nextDouble());
        System.out.println("Enter rental costs");
        services.setRentalCosts(sc.nextDouble());
        System.out.println("Enter max number of people");
        services.setMaxNumberOfPeople(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter type rent");
        services.setTypeRent(sc.nextLine());
        return services;
    }
    private static void addNewVilla(){
        Services villa = new Villa();
        villa = addNewService(villa);
        System.out.println("Enter Room Standard");
        ((Villa)villa).setRoomStandard(sc.nextLine());
        System.out.println("Enter convenient description");
        ((Villa) villa).setConvenientDescription(sc.nextLine());
        System.out.println("Enter area pool");
        ((Villa) villa).setAreaPool(sc.nextDouble());
        System.out.println("Enter number of floors");
        ((Villa) villa).setNumberOfFloors(sc.nextInt());
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        listVilla.add((Villa)villa);
        FunWriteAndReadFileCSV.writeVillaToFilesCSV(listVilla);
        System.out.println("\nAdd Villa "+villa.getNameService()+" Successfully");
        sc.nextLine();
        backMainMenu();
    }
    private static void addNewHouse(){

    }
    private static void addNewRoom(){

    }

}
