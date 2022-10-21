package conditions;

public class IfStatement {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;

        //if statement
        if(a>b){
            System.out.println("first number is greater");
        }

        //if else statement
        if(a>b){
            System.out.println("first number is greater");
        }else {
            System.out.println("second number is greater");
        }

        //if else if ... else
        int number = 0;

        if (number == 0) {
            System.out.println("this number is equal to 0");
        } else if (number > 0) {
            System.out.println("this number is positive");
        } else {
            System.out.println("this number is negative");
        }
    }
}
