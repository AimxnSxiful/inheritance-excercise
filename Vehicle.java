public class Vehicle {
    private String make;
    private String model;
    private int year;
    private int rentalPricePerDay;

    public Vehicle(String make, String model, int year, int rentalPricePerDay){
        this.make =make;
        this.model =model;
        this.year =year;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    
    public String getMake(){
        return make;

    }

    public String getModel(){
        return model;

    }


    public int getYear(){
        return year;

    }
    public int getRentalPricePerDay(){
        return rentalPricePerDay;
    }

    public void setMake(String make){
        this.make =make;

    }


    public void setModel(String model){
        this.model = model;

    }

    public void setYear(int year){
        this.year =year;

    }

    public void setRentalPricePerDay(int rentalPricePerDay){
        this.rentalPricePerDay =rentalPricePerDay;

    }
    

    public int calculateRentalCost(int days){
        return rentalPricePerDay *days;

    }

}


