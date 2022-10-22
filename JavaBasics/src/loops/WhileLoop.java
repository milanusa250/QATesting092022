package loops;

public class WhileLoop {
    public static void main(String[] args) {
        //while loop: the condition is first checked then code is executed
        int i = 0;//starting point
        while(i>5){//condition
            System.out.println(i);//0
            i++;//incrementation i = i+1; //5
            System.out.println(i);//1
        }
        //System.out.println("exited the while loop");
    }
}

/*
0
1

1
2

2
3

3
4

4
5
*/
