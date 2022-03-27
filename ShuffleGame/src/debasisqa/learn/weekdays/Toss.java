package debasisqa.learn.weekdays;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Toss {

    // A Function to generate a random permutation of arr[] for shuffling
    int[] randomize( int arr[], int n)
    {
        // Creating a object for Random class
        Random r = new Random();

        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n-1; i > 0; i--) {

            // Pick a random index from 0 to i
            int j = r.nextInt(i);

            // Swap arr[i] with the element at random index
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Prints the random array
        System.out.println(Arrays.toString(arr));

        return arr;
    }
    //main function to start the program
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Scanner charScanner = new Scanner( System.in ).useDelimiter( "(\\b|\\B)" ) ;
        String entryCase;
        int selectPosition=-1;
        int[] arr = {1, 0, 1};
        int n = arr.length;
        Toss t = new Toss();

        System.out.println("------------------------------welcome to shuffle game--------------------------------");
        System.out.println("guess where the 0 is ?");
        System.out.println("are you ready to play? y/n\n");
        entryCase = userInput.next();
        do{
            do{
                if(entryCase.equals("n")){
                    System.out.println("---------------------------------see you next time!----------------------------------");
                    System.exit(0);
                }
                else if(entryCase.equals("y")){
                    break;
                }
                else {
                    System.out.println("wrong input, enter y/n\n");
                    entryCase = userInput.next();
                }
            }while (!entryCase.equals("y") );
            //shuffle the array before starting the game
            arr = getShuffeled(charScanner, arr, n, t);
            //select the position in the array to see if the guess selection finds number 0 ot not
            selectPosition = getSelectPosition(userInput, selectPosition,arr);

            if(arr[selectPosition-1] == 0){
                System.out.println("good guess!");
            }
            else{
                System.out.println("sorry!!! wrong guess");
            }

            System.out.println("do you want to play again? y/n\n");

            entryCase = userInput.next();

            while (!entryCase.equals("y") && !entryCase.equals("n") ){
                System.out.println("wrong choice, please enter y or n");
                entryCase = userInput.next();
                if(entryCase.equals("y") || entryCase.equals("n")){
                    break;
                }
            }

        }while (entryCase.equals("y"));

        System.out.println("---------------------------------see you next time!----------------------------------");

    }

    private static int getSelectPosition(Scanner userInput, int selectPosition, int[] arr) {
        String choicePosition;
        do{
            System.out.println("choose correct position\npick 1, 2 or 3!");
            choicePosition = userInput.next();
            if(choicePosition.matches("-?\\d+(.\\d+)?")) {
                selectPosition = Integer.parseInt(choicePosition);
                if(selectPosition>0 && selectPosition<=arr.length) {
                    break;
                }
            }
            else {
                continue;
            }
        }while(true);
        return selectPosition;
    }
    /*
    * getShuffeled()

    */
    private static int[] getShuffeled(Scanner charScanner, int[] arr, int n, Toss t) {
        String entryCase;
        System.out.println("shuffle the game, hit \"Enter\"");

        do{
            entryCase = charScanner.next();
            //int value = entryCase.length();
            if(entryCase.equalsIgnoreCase("\n")) {
                arr = t.randomize(arr, n);
                break;
            }
            else {
                System.out.println("wrong input please hit \"Enter\"");
                entryCase = charScanner.next();
            }

        }while(!entryCase.equalsIgnoreCase("\n"));
        return arr;
    }

}
