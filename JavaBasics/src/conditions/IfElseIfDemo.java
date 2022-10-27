package conditions;

class IfElseIfDemo {
    public static void main(String args[])
    {
        int i = 5;

        Integer abc = new Integer(20);
        float ft = 12.02F;
        int floatToIn = (int) ft;
        System.out.println("primitive data type conversion: "+floatToIn);

        Float fd = new Float(12.02);
        System.out.println("non-primitive data type conversion: "+fd.intValue());

        if (i == 10)
            System.out.println("i is 10");
        else if (i == 15)
            System.out.println("i is 15");
        else if (i == 20)
            System.out.println("i is 20");
        else
            System.out.println("i is not present");
    }
}
