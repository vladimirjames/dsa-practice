/*Lets say you have two variables a and b.
Let a = 2, b=4.
Now lets say I want to swap the values in these variables, how can I do it?
If I assign a = b, then a will have 4 but b will also be having 4, which means a value of 2 will be lost.
Similarly if I assign b=a, then b will have 2 but a will also be having 2, which mean b value of 4 will be lost.
So how to tackle this?
Lets say I have temp variable where I store one of a or b value.
     temp = a;
Now let me store b value in a, so how b has 2 and a has 2 too. But since we have stored a value already in 4.
Now I can get the value from temp and store it in b.
That is
     a=b;
     b = temp;

So now a wil have 4 and b will have 2.
So how did we swap the two variables values?

    temp = a;
    b=a;
    a = temp;*/

public class SwapTwoVariablesValue {

    public static void main(String[] args) {

        int a = 25, b = 32;
//         int temp = a;
//         a = b;
//         b = temp;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);

    }

}
