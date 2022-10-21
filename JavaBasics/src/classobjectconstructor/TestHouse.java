package classobjectconstructor;

public class TestHouse {
    public static void main(String[] args) {

        House atikurHouse = new House("the melenium", 6771);

        atikurHouse.bathRoom();
        atikurHouse.kitchen();
        atikurHouse.room();
        atikurHouse.room();
        atikurHouse.room();
        atikurHouse.room();
        atikurHouse.bathRoom();
        atikurHouse.livingRoom();

        House zaberHouse = new House("Tree Human", 2331);

        zaberHouse.livingRoom();
        zaberHouse.room();
        zaberHouse.room();
        zaberHouse.room();
        zaberHouse.kitchen();
        zaberHouse.bathRoom();

        House indraHouse = new House("Tower");
        indraHouse.kitchen();
        indraHouse.bathRoom();
        indraHouse.room();

        House chaterjeeHouse = new House(347);
        chaterjeeHouse.room();
        chaterjeeHouse.bathRoom();
        chaterjeeHouse.kitchen();

        House moHouse = new House();
        moHouse.room();

    }
}
