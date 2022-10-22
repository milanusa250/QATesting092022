package loops;

public class ForEachLoop {
    public static void main(String[] args) {
        //for each loop
        String[] menu = {"fish curry", "cabbage", "potato", "chicken", "soup"};
/*        for(int i = 0; i< 6; i++ ){
            String MenuName = menu[i];
            System.out.println("Menu "+i+ "th index item is :"+ MenuName);
        }*/

        for(String MenuName : menu){
            System.out.println("Menu items are as below:"+MenuName);
        }
        //print the number of students in class 4.
        int[] noOfStudentsInClass = {30, 45, 12, 65, 32};
        System.out.println("no Of Students In Class four: "+noOfStudentsInClass[3] );

    }
}
