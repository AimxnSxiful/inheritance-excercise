class Motorcycle extends Vehicle{

    private int engineSize;

    public Motorcycle(String make, String model, int year, int rentalPricePerDay,int engineSize) {
        super(make, model, year, rentalPricePerDay);
        this.engineSize  = engineSize ;

    }
    
    public int getEngineSize(){
        return engineSize;
    }

    public void setEngineSize(int engineSize){
        this.engineSize = engineSize;
    }

    public String Motor(){
        System.out.println("Motorcycle rented [Make:" +getMake() +" Model: " + getModel() + " Year Manufactured:" + getYear() + " Engine Size:" + engineSize + "CC"+ " Rental per day: " + getRentalPricePerDay()+ "]");
        return "";


    }

}
