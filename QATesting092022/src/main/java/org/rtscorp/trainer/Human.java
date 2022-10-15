package org.rtscorp.trainer;

/**
 * This the design for humanbeing
 * Human is build with hand, legs, ears, nose, name e.t.c //member variable or instance variable or characteristics//attributes
 * Human can run(), can cry(), can smile()*/ //method or behavior

class Human {

    int hand=2;
    int leg=2;
    int ears=1;
    int nose=1;
    String name;
    String phoneNo;

    Human(){
        name = new String("Huda");
    }

    Human(String humanName){
        name= humanName;
    }

    Human(String humanName, String phNumber){
        name = humanName;
        phoneNo= phNumber;
    }

    String run(){
        return name + "runs by" + leg + "leg";
    }

    int doSummation(){

        int totalOrgan = hand + leg + ears + nose;

        return totalOrgan;
    }
    int cry(){
        return 0;
    }

    int smile(){
        return 0;
    }

    public static void main (String ... abc){
        Human junior = new Human();
        String action=junior.run();
        System.out.println(junior.name +" is run"+"ing");
        System.out.println(junior.name + " has total organ: " + junior.doSummation());

        Human junior2 = new Human("Khadija");
        System.out.println("My name is " + junior2.name);

        Human junior3 = new Human("Hossain", "6100222445");
        System.out.println("My name is " + junior3.name +"\n"+ "My phone number is " + junior3.phoneNo);
    }

}
