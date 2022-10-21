package keywords.modifiers.access;

public class Computer {

    //public / private / default / protected

    /*
    * access keywords.modifiers are keywords that are defining the accessibility privilege for java elements
    ------------|--------------------------------------------------------|------------------
    modifier    | description                                            | applicable for
    ------------|--------------------------------------------------------|------------------
    public      | accessible by any other class anywhere in the project  | classes/properties
    ------------|--------------------------------------------------------|------------------
    default     | accessible only in the same package                    | classes/properties
    ------------|--------------------------------------------------------|------------------
    private     | accessible only from the same class                    | properties only
    ------------|--------------------------------------------------------|------------------
    protected   | accessible from the same package and subclass          | properties only
    ------------|--------------------------------------------------------|------------------
    ps: properties are variables, methods and constructors

    can a class be private or non ? no
     */

    private int ram = 16;
    String name = "dell";

    public Computer(){

    }

    protected void operatingSystem(){
        System.out.println("linux box");
    }

    private void hardDisk(){
        System.out.println("ssd hard drive");
    }
}
