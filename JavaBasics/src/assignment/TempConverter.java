package assignment;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int mode;
        int tempToConvert;
        int tempConverted;

        System.out.println("-----------------------------------Welcome------------------------------------------");
        System.out.println("-----------------Celsius-Fahrenheit/Fahrenheit-Celsius converter--------------------");

        do{
            System.out.println("choose the conversion mode:");
            System.out.println("1- Celsius-Fahrenheit");
            System.out.println("2- Fahrenheit-Celsius");

            mode = userInput.nextInt();

            while (mode != 1 && mode !=2){
                System.out.println("wrong choice, please enter 1 or 2");
                mode = userInput.nextInt();
                if(mode == 1 || mode ==2){
                    break;
                }
            }

            System.out.println("Enter the temperature to convert:");
            tempToConvert = userInput.nextInt();

            if(mode == 1){
                tempConverted = (tempToConvert * 9/5) + 32;
                System.out.println(tempToConvert+" C ----> "+tempConverted+" F");
            }else{
                tempConverted = (tempToConvert - 32) * 5/9;
                System.out.println(tempToConvert+" F ----> "+tempConverted+" C");
            }

            System.out.println("do you want to convert other temperatures ? 1- Yes/2- No");

            mode = userInput.nextInt();

            while (mode != 1 && mode !=2){
                System.out.println("wrong choice, please enter 1 or 2");
                mode = userInput.nextInt();
                if(mode == 1 || mode ==2){
                    break;
                }
            }

        }while (mode == 1);

        System.out.println("-----------------------------Good bye, see you soon----------------------------------");

    }
}
