package loops;

public class Pyramid {
    public void rightAngleTriangle() {
        int rows = 5;
        for (int i = 1; i <= rows; ++i) {//this line confirms rows creation
            for (int j = 1; j <= i; ++j) {//this line confirms how many * will be printed in one row
                System.out.print("* ");
            }
            System.out.println();//this creates a new line after each line
        }
    }

    public void mirrorOfRightAngleTriangle(){
        int rows = 5;
        int i,j;
        // outer loop to handle number of rows
        //  rows in this case
        for(i=1; i<=rows; i++)
        {

            // inner loop to handle number spaces
            for(j=2*(rows-i); j>=0; j--)
            {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=1; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }

    public void fafeToFacefRightAngleTriangle(){
        int rows = 5;
        int i,j;
        // outer loop to handle number of rows
        //  rows in this case
        for(i=1; i<=rows; i++)
        {
            for (j = 1; j <= i; ++j) {//this line confirms how many * will be printed in one row
                System.out.print("* ");
            }
            // inner loop to handle number spaces
            for(j=4*(rows-i); j>=0; j--)
            {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=1; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }

    public void printPerfectpramid(){
        int rows = 5;
        int i,j;
        // outer loop to handle number of rows
        //  rows in this case
        for(i=1; i<=rows; i++)
        {

            // inner loop to handle number spaces
            for(j=(rows-i); j>=0; j--)
            {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=1; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }

    public static void main(String[] args){
        Pyramid pd = new Pyramid();
        pd.rightAngleTriangle();
        pd.mirrorOfRightAngleTriangle();
        pd.fafeToFacefRightAngleTriangle();
        pd.printPerfectpramid();
    }


}
