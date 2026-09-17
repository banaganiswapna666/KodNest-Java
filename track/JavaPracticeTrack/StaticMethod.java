
class Car {

    static void convertKmIntoMiles() {
        System.out.println("Converting KM into Miles");
    }

    void calculateMilage() {
        System.out.println("Calculate Milage");
    }
}

public class StaticMethod {

    public static void main(String[] args) {
        Car.convertKmIntoMiles();
        Car car = new Car();
        car.calculateMilage();
    }
}
