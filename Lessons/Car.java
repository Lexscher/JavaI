public class Car {

    private static String[] cars = { "Volvo", "Tesla", "BMW", "Toyota", "Jeep", "Audi"};

    public static void printCars(String[] carsArr) {
        for(String car : carsArr)
            System.out.println(car);
    }
    // Search for car in array - Returns the car that's found, or string "Car Not Found"

    // Add car to array
    public static void addCarToArray(String newCar) {
        // Create a new cars array
        String[] newCarsArray = new String[cars.length + 1];
        // Assign the items in cars array to the new cars array
        for (int i = 0; i < cars.length; i++)
            newCarsArray[i] = cars[i];

        // Now add the new car to the end of the new array
        newCarsArray[newCarsArray.length - 1] = newCar;

        // Point the cars array to the newCarsArray in memory
        cars = newCarsArray;
    }

    // Remove car from  array (Will be made after "Search for car in array")

    public static void main(String[] args) {
        printCars(cars);
        System.out.println("-----\n     \n-----");
        addCarToArray("Tesla Model X");
        printCars(cars);
    }
}