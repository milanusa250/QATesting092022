package datatype.nonprimitive;

public class UseArray {
    public static void main(String[] args) {
        //array: data type object that hold multiple values
        //syntax: dataType[] arrayName = {value1, value2, value3}
        int[] array1 = {1, 2, 3, 4, 5};

        String[] array2 = {"Debasis", "Habib", "Huda"};

        //array declaration: arrayType[] arrayName;
        //arrayType arrayName = new arrayName[arrayLength];
        int[] array;
        array = new int[5];

        //array assignment: array[index] = variableValue;
        array[0] = 6;
        array[1] = 5;
        array[2] = 2;
        array[3] = 5;
        array[4] = 2;

        System.out.println(array[4]);
    }
}
