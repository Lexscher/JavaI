public class Car {

    private static String[] cars = { "Volvo", "Tesla", "BMW", "Toyota", "Jeep", "Audi"};

    public static void printCars(String[] carsArr) {
        for(String car : carsArr)
            System.out.println(car);
    }
    // Search for car in array - Returns the car that's found, or string "Car Not Found"
    public static String findCarInArray(String car) {
        String foundCar = "false";
        // Go through all the cars
        for (String carFromArray : cars) {
            // If we've found the car we're looking for
            if(carFromArray == car) 
                // Assign that car to "foundCar"
                foundCar = carFromArray;
        }

        return foundCar;
    }
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

    // Remove car from  array
    public static String removeCarFromArray(String car) {
        // Handle car not found
        if (findCarInArray(car) == "false") 
            return car + " does not exsist in this array.";
        // Create a new array that's one index shorter than cars
        String[] newCarArray = new String[cars.length - 1];
        // initialize a new index
        int index = 0;
        // Loop that many times
        for (int i = 0; i < cars.length; i++) {
            // if the car is the one we're going to remove, skip the rest of the block.
            if (cars[i] == car)
                continue;
            // Assign the values to the new car array
            newCarArray
        }
    }

    public static void main(String[] args) {
        printCars(cars);
        System.out.println("-----\n     \n-----");
        addCarToArray("Tesla Model X");
        printCars(cars);
        System.out.println(findCarInArray("Jaguar"));
        System.out.println(findCarInArray("Volvo"));
    }
}