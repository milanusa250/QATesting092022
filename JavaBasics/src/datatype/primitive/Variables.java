package datatype.primitive;

public class Variables {
    public static void main(String[] args) {
        //primitive variables
        //numbers:
        //whole number
        byte b = -128;//1 byte
        short s = 24642;//2 bytes
        int i = 1765569660;//4 bytes
        long l = 1254345698579045785L;//8 bytes

        //decimal or fraction
        float f = 1.5676544535334565645343F;//4 bytes
        double d = 1.766535467809435676345678765467876544;//8 bytes

        //character
        char aChar = 'a';//2 bytes

        //boolean (true or false)
        boolean bool = true;//1 bit (1/8 byte)

        //variable declaration: variableType variableName;

        int a;


        //variable assignment: variableName = variableValue;
        a = 1234;


        //in line variable declaration and assignment: variableType variableName = variableValue;
        int z = 12345;

        //value reassignment
        System.out.println(a);//before reassignment --> prints 1234
        a = 10;
        System.out.println(a);//after reassignment --> prints 10
    }
}
