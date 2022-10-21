package oops.abstraction;

public class Toyota extends ModernCar implements Car, Motor{

    //car interface methods
    public void start(){
        System.out.println("turn the key and start");
    }
    public void stop() {
        System.out.println("stop the car");
    }

    //toyota class method
    public void autoRadio(){
        System.out.println("music lalalalala");
    }

    //a class can implement multiple interfaces
    //motor interface
    public void engine() {
        System.out.println("with turbo");
    }
    public void fuelType() {
        System.out.println("diesel");
    }

    //moder car abstract class method
    public void hydraulicBrake() {
        System.out.println("efficient hydraulic brake");
    }
}
