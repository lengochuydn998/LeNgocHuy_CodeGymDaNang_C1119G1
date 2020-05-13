package CaseStudy.Controllers;

import CaseStudy.Commons.FunValidation;
import CaseStudy.Commons.FuncGeneric;
import CaseStudy.Commons.FuncWriteAndReadFileCSV;
import CaseStudy.Commons.ScannerUtils;
import CaseStudy.Models.Customer;
import CaseStudy.Models.SortNameAndYear;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;

import static CaseStudy.Commons.FuncGeneric.displayList;
import static CaseStudy.Controllers.MainController.backMainMenu;

public class CustomerController {
    public static final String ENTER_ID_CARD = "Enter ID Card";
    public static final String INVALID_ID_CARD = "Id card format XXX-XXX-XXX";
    public static final String ENTER_CUSTOMER_NAME = "ENTER CUSTOMER NAME";
    public static final String INVALID_CUSTOMER_NAME = "Customer name must be capitalized with my fist letters";
    public static final String ENTER_BIRTHDAY_CUSTOMER = "ENTER BIRTHDAY CUSTOMER";
    public static final String INVALID_BIRTHDAY_CUSTOMER = "Birthday format dd/mm/yyyy";
    public static final String ENTER_GENDER = "ENTER GENDER";
    public static final String INVALID_GENDER = "Gender is one of (Male/Female/Unknow)";
    public static final String ENTER_CUSTOMER_EMAIL = "ENTER CUSTOMER EMAIL";
    public static final String INVALID_CUSTOMER_EMAIL = "Format abc@abc.abc";


    public static void addNewCustomer(){
        Customer customer = new Customer();

        customer.setEmail(FunValidation.getValidEmail(ENTER_CUSTOMER_EMAIL,INVALID_CUSTOMER_EMAIL));
        customer.setFullName(FunValidation.getValidCustomerName(ENTER_CUSTOMER_NAME,INVALID_CUSTOMER_NAME));
        customer.setBirthday(FunValidation.getValidBirthday(ENTER_BIRTHDAY_CUSTOMER,INVALID_BIRTHDAY_CUSTOMER));
        String gender = FunValidation.getValidGender(ENTER_GENDER,INVALID_GENDER);
        customer.setGender(Character.toUpperCase(gender.charAt(0))+gender.substring(1,gender.length()).toLowerCase());
        customer.setIdCard(FunValidation.getValidIdCard(ENTER_ID_CARD,INVALID_ID_CARD));
        System.out.println("Enter Phone Number: ");
        customer.setPhone(ScannerUtils.scanner.nextLine());
        System.out.println("Enter Type Customer: ");
        customer.setCustomerType(ScannerUtils.scanner.nextLine());
        System.out.println("Enter Address Customer: ");
        customer.setAddress(ScannerUtils.scanner.nextLine());

        //Get list
        ArrayList<Customer> customerList = FuncGeneric.getListFromCVS(FuncGeneric.EntityType.CUSTOMER);
        // Add list
        customerList.add(customer);
        //write
        FuncWriteAndReadFileCSV.writeCustomerToFileCsv(customerList);
        System.out.println("-----Add Customer: "+ customer.getFullName()+" Successfully !!!");

    }
    public static void showInformationOfCustomer(){
        ArrayList<Customer> customerList = FuncGeneric.getListFromCVS(FuncGeneric.EntityType.CUSTOMER);
        // sắp xếp theo thứ tự alpha B theo tên trường hợp cùng tên xếp theo năm sinh
        customerList.sort(new SortNameAndYear());
        displayList(customerList);
        backMainMenu();
    }

}
