package datatype.nonprimitive;

public class UseString {
    public static void main(String[] args) {
        //non-primitive variables
        //chain characters
        String str = "Md";

        int exampleChar = 77;
        System.out.println ("Decimal to char conversion: " + (char)exampleChar);

        System.out.println("Converted to upper case:" +str.toUpperCase());
        System.out.println("Converted to small case: "+str.toLowerCase());
        System.out.println(str.replace(" ", "+++"));

        //+ sign in java
        //+ sign does concatenation with strings
        String str2 = "classobjectmethod.Hello";
        System.out.println(str2 + " " + str);

        //+ does math with numbers
        System.out.println(4 + 7);
    }
}
