/*Given an integer n,
find the absolute difference between sum of the squares of first n natural numbers and square of sum of first n natural numbers.
Examples:
Input: n = 2
Output: 4
Explanation: abs|(12 + 22) - (1 + 2)2| = 4.
Input: n = 3
Output: 22
Explanation: abs|(12 + 22 + 32) - (1 + 2 + 3)2| = 22.*/

public class SquaresDifference {

    public static int squaresDiff(int n) {

        double sumOfSquares = n * (n+1)*((2*n)+1)/6;
        double squareOfSum = Math.pow((n * (n+1)/2), 2);

        return (int)Math.abs(sumOfSquares-squareOfSum);

    }

    public static void main(String[] args) {

        System.out.println(squaresDiff(2));

    }
}
