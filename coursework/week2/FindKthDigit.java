/*Find Kth Digit
Given two numbers a and b, find kth digit from right of ab.
Example 1:
Input: a = 3, b = 3, k = 1
Output: 7
Explanation: 33 = 27 and 1st digit from right is 7
Input: a = 5, b = 2, k = 2
Output: 2
Explanation: 52 = 25 and second digit from right is 2.*/


public class FindKthDigit {

    static long kthDigit(int a, int b, int k) {

        long power = (long) Math.pow(a,b), lastDigit = 0;

        for (int i = 0; i < k; i++) {

            lastDigit = power % 10;
            power = power / 10;

        }

        return lastDigit;

    }

    public static void main(String[] args) {

        long ans = kthDigit(11,11,1);
        System.out.println(ans);

    }

}
