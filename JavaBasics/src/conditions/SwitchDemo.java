package conditions;


public class SwitchDemo {

    public static void main(String[] arg) {
        //int day = 4;
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (String day : weekdays) {
            switch (day) {
                case "Monday":
                    System.out.println("First working day of the week");
                    break;
                case "Tuesday":
                    System.out.println("I had too many meeting");
                    break;
                case "Wednesday":
                    System.out.println("Middle of the week");
                    break;
                default:
                    System.out.println("Non-working day");
            }
        }
    }
}

