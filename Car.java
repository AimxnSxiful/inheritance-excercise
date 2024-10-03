class Car extends Vehicle{
    private int seats;
    private  int numdoors;
    public Car(String make, String model, int year, int rentalPricePerDay, int seats , int numdoors) {
        super(make, model, year, rentalPricePerDay);
        this.seats = seats;
        this.numdoors =numdoors;
    }
    public int getSeats(){
        return seats;

    }

    public int getNumdoors(){
        return numdoors;
    }

    public void setSeats(int seats){
        this.seats = seats;

    }
    public void setNumdoors(int numdoors){
        this.numdoors = numdoors;
    }

    public String kereta(){
        System.out.println("Car Rented [Make:" +getMake() +" Model:" + getModel() + " Year Manufactured: " + getYear() + " Number Seats: " + getSeats() + " Number of door: " + getNumdoors()+ " Rental per day: "+ getRentalPricePerDay() +"]");
        return "";
    }



}

