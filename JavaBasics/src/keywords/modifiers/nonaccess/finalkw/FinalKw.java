package keywords.modifiers.nonaccess.finalkw;

//final in class: class cannot be inherited
public final class FinalKw {
    public static void main(String[] args) {
        //final in variable: cannot be reassigned
        final int number2 = 9;
        System.out.println(number2);

        //final variable cannot be reassigned
        //number2 = 6;
    }

    //final in method: cannot be overridden
    final void test(){
        System.out.println("final in methods");
    }
}
