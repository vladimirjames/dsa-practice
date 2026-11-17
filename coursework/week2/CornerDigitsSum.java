/*Corner Digits Sum
Given a positive integer n, find the sum of the first and the last digit of n.
Examples:
Input: n = 12345
Output: 6
Explanation: 1st and last digits are 1 and 5.
Input: n = 98562
Output: 11
Explanation: 1st and last digits are 9 and 2.*/

public class CornerDigitsSum {

    public static int cornerDigitSum(int n) {

        int firstDigit = 0;
        int lastDigit = n % 10;

        while (n > 0) {

            firstDigit = n % 10;
            n  = n / 10;
        }

        return lastDigit + firstDigit;

    }

    public static void main(String[] args) {

        int ans = cornerDigitSum(98562);
        System.out.println(ans);



    }


}
