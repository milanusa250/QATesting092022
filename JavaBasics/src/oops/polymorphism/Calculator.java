package oops.polymorphism;

public class Calculator {

    //polymorphism: methods having multiple forms
    //overloading: use the same method name with different number of parameters

    public int add(int a, int b){
        int total = a + b;
        return total;
    }

    public int add(int a, int b, int c){
        int total = a + b;
        return total;
    }

    //overriding: use the same method name same parameters and different body (implementation)
    public int sub(int a, int b){
        int total = a - b;
        return total;
    }
}
