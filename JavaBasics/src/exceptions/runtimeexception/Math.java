package exceptions.runtimeexception;

public class Math {
    public static void main(String[] args) {

        int a = 10;

        int b = 0;

        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        System.out.println("line 4");
        System.out.println("line 5");
        System.out.println("line 6");
        try{
            System.out.println("line 7 "+(a/b));
        }catch (Exception e){
            System.out.println("line 7 "+" error occured");
        }finally {

        }

        System.out.println("line 8");

        //what is the difference between final finally and finalize
    }
}
