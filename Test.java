
public class Test {
    public static void main(String[] args) {

        Car car = new Car("Perodua", "myvi", 2020, 150, 5, 4);
        Motorcycle motorcycle = new Motorcycle("Yamaha ", "R25", 2021, 90, 250);

        int rentalDays = 5;
        int carRentalCost = car.calculateRentalCost(rentalDays);
        int motorcycleRentalCost = motorcycle.calculateRentalCost(rentalDays);

        System.out.print(car.kereta());
        System.out.println("Rental Cost for " + rentalDays + " days: " + carRentalCost);

        System.out.println();

        System.out.println(motorcycle.Motor());
        System.out.println("Rental Cost for " + rentalDays + " days: " + motorcycleRentalCost);
    }
}