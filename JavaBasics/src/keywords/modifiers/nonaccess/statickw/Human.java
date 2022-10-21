package keywords.modifiers.nonaccess.statickw;

public class Human {

    static int height = 9;
    int weight = 170;

    private static String name;

    //static method: can use only static methods and variables
    public static void talk(){
        System.out.println(height);
        //System.out.println(weight);
        System.out.println("human can speak");
    }

    //non static method: we can use both of static and non static
    public void smile(){
        System.out.println(height);
        System.out.println(weight);
        System.out.println("human smiles for no reason");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
