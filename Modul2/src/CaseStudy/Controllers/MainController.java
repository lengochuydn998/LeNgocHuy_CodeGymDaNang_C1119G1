package CaseStudy.Controllers;

import CaseStudy.Commons.ScannerUtils;

import static CaseStudy.Commons.Menu.displayMenuBackToMain;
import static CaseStudy.Commons.Menu.displayMenuMain;
import static CaseStudy.Controllers.BookingController.addNewBooking;
import static CaseStudy.Controllers.BookingController.bookingMovieTicket4D;
import static CaseStudy.Controllers.CustomerController.addNewCustomer;
import static CaseStudy.Controllers.CustomerController.showInformationOfCustomer;
import static CaseStudy.Controllers.EmployeeController.findEmployee;
import static CaseStudy.Controllers.EmployeeController.showInformationOfEmployee;
import static CaseStudy.Controllers.ServiceController.addNewService;
import static CaseStudy.Controllers.ServiceController.showServices;

public class MainController {

    public static void processMain(){
        try{
            displayMenuMain();
            processMenuMain();

        }catch (Exception e){
            backMainMenu();
        }

    }
    public static void processMenuMain(){
            switch (ScannerUtils.scanner.nextLine()){
            case "1":
                addNewService();
                break;
            case "2":
                showServices();
                break;
            case "3":
                addNewCustomer();
            case "4":
                showInformationOfCustomer();
                break;
            case "5":
                addNewBooking();
                break;
            case "6":
                showInformationOfEmployee();
                break;
            case "7":
                bookingMovieTicket4D();
                break;
            case "8":
                findEmployee();
            case "9":
                System.exit(0);
            default:
                System.out.println("Fail --- Please choose 1-9");
                backMainMenu();
        }
    }

    public static void backMainMenu() {
        displayMenuBackToMain();
        processMain();
    }
}

