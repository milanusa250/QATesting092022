package operators;

public class Operators {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;
        //java logic
        String str = "John Doe";
        System.out.println(str + number1 + number2);//prints John Doe105
        System.out.println(str + (number1 + number2));//prints John Doe15
        System.out.println(10 > 9);//prints true
        System.out.println(10 != 10);//prints false

        /*
        arithmetic operators (do math):
        +: addition
        -: subtraction
        /: division
        *: multiplication
        %: division remainder
        ++: increment by 1
        --: decrement by 1
         */
        int number3 = 10;
        System.out.println(--number3);//prints 9

        /*
        assignment operators:
        =: assign value
        +=: x += 3 same as x = x + 3
        -=: x -= 3 same as x = x - 3
        *=: x *= 3 same as x = x * 3
        /=: x /= 3 same as x = x / 3
        %=: x %= 3 same as x = x % 3
         */
        int number4 = -1;
        number4 += number4;
        System.out.println(number4);

        /*
        comparison operators:
        ==: equal to
        !=: not equal to
        >: greater than
        <: less than
        >=: greater than or equal to
        <=: less than or equals to
         */
        System.out.println(10 > 9);//prints true
        System.out.println(10 != 10);//prints false

        /*
        logical operators:
        &&: and
        ||: or
        !: not
         */
        System.out.println(10 > 9 && 10 != 10);//the 2 condition are satisfied --> prints false
        System.out.println(!(10 > 9));//same as 10>0 is false --> prints false

    }
}
