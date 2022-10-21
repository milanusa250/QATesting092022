package nestedclass;

public class Outer {

    int outerNum = 6;
    String outerStr = "john";

    Inner inner = new Inner();

    public Outer(){

    }

    public void outerMethod(){
        System.out.println("this belongs to outer class");
    }

    //nested class
    class Inner{

        int innerNum = 10;
        String innerStr = "doe";

        public Inner(){

        }

        public void InnerMethod(){
            System.out.println("this belongs to inner class");
        }

    }
}
