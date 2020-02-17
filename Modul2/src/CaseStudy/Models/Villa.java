package CaseStudy.Models;

public class Villa extends Services{
    private String roomStandard;
    private String convenientDescription;
    private double areaPool;
    private int numberOfFloors;

    public Villa() {
    }
    public String getRoomStandard() {
        return roomStandard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public Villa(String id, String nameService, double areUsed,
                 double rentalCosts, int maxNumberOfPeople, String typeRent,
                 String roomStandard, String convenientDescription, double areaPool, int numberOfFloors) {
        super(id, nameService, areUsed, rentalCosts, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenientDescription() {
        return convenientDescription;
    }

    public void setConvenientDescription(String convenientDescription) {
        this.convenientDescription = convenientDescription;
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInfo(){
        return "\nId Service: "+super.getId()+
                "\nName Service "+super.getNameService()+
                "\nArea Used: "+super.getareaUsed()+
                "\nRental Costs: "+super.getRentalCosts()+
                "\nMax Number Of People: "+super.getMaxNumberOfPeople()+
                "\nType Rent: "+super.getTypeRent()+
                "\nRoom Standard: "+this.roomStandard+
                "\nconvenientDescription: "+this.convenientDescription+
                "\nArea Pool"+this.areaPool+
                "\nNumber Of Floors"+this.numberOfFloors;
    }
}
