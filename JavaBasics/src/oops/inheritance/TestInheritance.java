package oops.inheritance;

public class TestInheritance {
    public static void main(String[] args) {

        GrandFather jack = new GrandFather();
        jack.rich();

        Father john = new Father();
        john.smart();
        john.rich();

        Son sean = new Son();
        sean.smart();
        sean.rich();
    }
}
