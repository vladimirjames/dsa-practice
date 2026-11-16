/*
Half Diamond Star Pattern
Given an integer n, print the Half Diamond Star Pattern using * characters as shown in the examples.
Examples:
Input: 5
Output:
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        *

Input: 3
Output:
        *
        * *
        * * *
        * *
        *
*/

public class Pattern9 {

    public static void printHalfStar(int n) {

        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j <= i ; j++) {

                System.out.print("* ");

            }

            System.out.println();

        }

        for (int i = n; i > 1 ; i--) {

            for (int j = 2; j <= i; j++) {

                System.out.print("* ");
            }

            System.out.println();

        }

    }

    public static void main(String[] args) {

        int n = 5;
        printHalfStar(n);

    }

}
