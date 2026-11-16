/*
Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.
Input:  2 Name y
Expected Output:
        2
        Name
        y
*/

import java.util.Scanner;
class Problem1 {
     public static void main(String[] args) {

         Scanner in = new Scanner(System.in);

         int a = in.nextInt();
         String b = in.next();
         char c = in.next().charAt(0);

         System.out.println(a + "\n" + b + "\n" + c);

     }
 }