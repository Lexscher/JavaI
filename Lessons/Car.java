public class Car {

    private static String[] cars = { "Volvo", "Tesla", "BMW", "Toyota", "Jeep", "Audi"};

    public static void printCars(String[] carsArr) {
        for(String car : carsArr)
            System.out.println(car);
    }

    public static void main(String[] args) {
        printCars(cars);
    }
}