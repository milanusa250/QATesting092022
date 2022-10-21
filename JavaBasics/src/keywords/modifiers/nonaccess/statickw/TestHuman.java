package keywords.modifiers.nonaccess.statickw;

public class TestHuman {
    public static void main(String[] args) {

        //non static property belongs to the object
        //static property belongs to class

        Human human1 = new Human();
        human1.setName("queens");
        System.out.println(human1.getName());

        Human human2 = new Human();
        human2.setName("brooklyn");
        System.out.println(human2.getName());

        System.out.println(human1.getName());

        Human human3 = new Human();
        human3.setName("bronx");
        System.out.println(human3.getName());

        System.out.println(human2.getName());

        System.out.println(human1.getName());
    }
}
