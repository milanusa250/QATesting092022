package extra.userinput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("enter your name ");

        String name = userInput.nextLine();

        System.out.println("classobjectmethod.Hello "+name+", welcome to java class!!!");

        System.out.println("enter your number: ");

        int number = userInput.nextInt();

        System.out.println("classobjectmethod.Hello number "+number+", welcome to java class!!!");

    }
}
