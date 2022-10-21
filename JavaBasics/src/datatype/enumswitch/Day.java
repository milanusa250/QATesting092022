package datatype.enumswitch;

public class Day {

    public void whichDay(Week day){
        switch (day){
            case MON:
                System.out.println("attend course 1");
                break;
            case TUE:
                System.out.println("review recording");
                break;
            case WED:
                System.out.println("do homework");
                break;
            case THU:
                System.out.println("attend course 2");
                break;
            case FRI:
                System.out.println("review recording");
                break;
            case SAT:
                System.out.println("do homework");
                break;
            case SUN:
                System.out.println("rest");
                break;
        }
    }
}
