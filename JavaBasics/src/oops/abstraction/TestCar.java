package oops.abstraction;

public class TestCar {
    public static void main(String[] args) {

        Car corolla = new Toyota();
        corolla.start();
        corolla.stop();

        //cannot create object of interfaces and abstract classes
        //Car car = new Car();
        //ModernCar prius = new ModernCar();

        Toyota camry = new Toyota();
        camry.start();
        camry.stop();
        camry.autoRadio();
    }
}
