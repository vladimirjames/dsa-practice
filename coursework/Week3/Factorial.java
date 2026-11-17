/*Given a positive integer, n. Find the factorial of n.
Examples :
Input: n = 5
Output: 120
Explanation: 1 x 2 x 3 x 4 x 5 = 120
Input: n = 4
Output: 24
Explanation: 1 x 2 x 3 x 4 = 24*/

public class Factorial {

    static int factorial(int n) {

        int fact = 1;
        for (int i = 1; i <= n ; i++) {

            fact = fact * i;

        }

        return fact;
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));

    }
}

