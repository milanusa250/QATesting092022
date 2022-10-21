package loops;

public class ForEachLoop {
    public static void main(String[] args) {
        //for each loop
        String[] names = {"john", "sean", "dave", "jack", "brad"};
        for(String myName: names){
            System.out.println(myName);
        }
    }
}
