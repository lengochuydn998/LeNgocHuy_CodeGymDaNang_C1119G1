package CaseStudy.Models;

public class Room extends Services {
    private String freeService;

    public Room() {
    }

    public Room(String id, String nameService, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeRent, String freeSevice) {
        super(id, nameService, areaUsed, rentalCosts, maxNumberOfPeople, typeRent);
        this.freeService = freeSevice;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeSevice) {
        this.freeService = freeSevice;
    }

    @Override
    public String showInfo(){
        return "\nId Service: "+super.getId()+
                "\nName Service "+super.getNameService()+
                "\nArea Used: "+super.getareaUsed()+
                "\nRental Costs: "+super.getRentalCosts()+
                "\nMax Number Of People: "+super.getMaxNumberOfPeople()+
                "\nType Rent: "+super.getTypeRent()+
                "\nRoom Standard:"+this.freeService;
    }
}
