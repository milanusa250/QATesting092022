package classobjectconstructor;

public class House {
    //Human class blueprint

    //class properties

    //variables or data type
    String houseName;
    private String houseColor = "white";//this variable can be used only inside the class
    int houseAddress;

    //constructor
    //syntax: ClassName(){ work to do }
    //built constructors
    House(String myHouseName, int myHouseAddress){
        houseName = myHouseName;
        houseAddress = myHouseAddress;
        System.out.println("this house is: "+myHouseName+" it's address is "+myHouseAddress);
    }
    House(String myHouseName){
        houseName = myHouseName;
        System.out.println("this house is: "+myHouseName);
    }
    House(int myHouseAddress){
        houseAddress = myHouseAddress;
        System.out.println("this house address is "+myHouseAddress);
    }
    //default constructor
    House(){

    }

    //methods
    public void room(){
        System.out.println("sleep zzzzzzzz");
    }

    void bathRoom(){//this is default access modifier (default is when we have no access modifier)
        System.out.println("shower lalalalalalal");
    }

    void livingRoom(){
        System.out.println("watch tv");
    }

    void kitchen(){
        System.out.println("get fat yummy yummy");
    }

}
