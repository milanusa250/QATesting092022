package oops.polymorphism;

public class ModernCalculator extends Calculator{
    @Override
    public int sub(int a, int b){
        int total = a - b + 10;
        return total;
    }
}
