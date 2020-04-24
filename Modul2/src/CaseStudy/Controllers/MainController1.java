//package CaseStudy.Controllers;
//
//public class MainController1 {
//    public static void processMain(){
//        try{
//            displayMainMenu();
//            processMain();
//        }catch (Exception e){
//            backMainMenu();
//        }
//    }
//
//    private static void displayMainMenu() {
//    }

//    private Villa villa = new Villa();
//    private House house = new House();
//    private Room room = new Room();
//    Scanner scanner = new Scanner(System.in);
//        switch (scanner.nextInt()){
//            case 1:
//                addNewServices();
//                break;
//            case 2:
//                showServices();
//                break;
////            case 3:
////                addNewCustomer();
////            case 4:
////                showInformationOfCustomer();
////                break;
////            case 5:
////                addNewBooking();
////                break;
////            case 6:
////                showInformationOfEmployee();
////                break;
////            case 7:
////                bookingMovieTicket4D();
////                break;
////            case 8:
////                findEmployee();
//            case 9:
//                System.exit(0);
//            default:
//                System.out.println("Fail --- Please choose 1-9");
//                displayMainMenu();
//        }
//    }
//    private  void addNewServices(){
//        System.out.println("1.Add New Villa"
//                +"\n2.Add New House"
//                +"\n3.Add New Room"
//                +"\n4.Back To Menu"
//                +"\n5.Exit");
//        switch (scanner.nextInt()){
//            case 1:
//                addNewVilla();
//                addNewServices();
//                break;
//            case 2 :
//                addNewHouse();
//                addNewServices();
//                break;
//            case 3:
//                addNewRoom();
//                addNewServices();
//                break;
//            case 4:
//                displayMainMenu();
//                break;
//            case 5:
//                System.exit(0);
//                break;
//            default:
//                addNewServices();
//        }
//    }
//    private  void addNewVilla(){
//        scanner.nextLine();
//        System.out.println("Input Room Standard");
//        villa.setRoomStandard(scanner.nextLine());
//        System.out.println("Input Area Pool");
//        villa.setAreaPool(scanner.nextDouble());
//        System.out.println("Input Number Of Floors");
//        villa.setNumberOfFloors(scanner.nextInt());
//        scanner.nextLine();
//        System.out.println("Other Service Description");
//        villa.setOtherServiceDescription(scanner.nextLine());
//    }
//    private  void addNewHouse(){
//        scanner.nextLine();
//        System.out.println("Input Room Standard");
//        house.setRoomStandard(scanner.nextLine());
//        System.out.println("Input Number Of Floors");
//        house.setNumberOfFloors(scanner.nextInt());
//        scanner.nextLine();
//        System.out.println("Other Service Description");
//        house.setOtherServiceDescription(scanner.nextLine());
//    }
//    private  void addNewRoom(){
//        scanner.nextLine();
//        System.out.println("Input Free Service");
//        room.setFreeService(scanner.nextLine());
//    }
//    private  void showServices() {
//        System.out.println("1.Show All Villa"
//                + "\n2.Show All House"
//                + "\n3.Show All Room"
//                + "\n4.Show All Name Villa Not Duplicate"
//                + "\n5.Show All Name House Not Duplicate"
//                + "\n6.Show All Name Name Not Duplicate"
//                + "\n7.Back to menu"
//                + "\n8.Exit");
//        switch (scanner.nextInt()) {
//            case 1:
//                villa.showInfo();
//                break;
//            case 2:
//                house.showInfo();
//                break;
//            case 3:
//                room.showInfo();
//                break;
//            case 7:
//                displayMainMenu();
//                break;
//            case 8:
//                System.exit(0);
//            default:
//                showServices();
//
//        }
//    }
