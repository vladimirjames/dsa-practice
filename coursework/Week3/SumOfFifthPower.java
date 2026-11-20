/*Given a positive integer n, find the sum of the fifth powers of the first n natural numbers.
Examples:
Input: n = 2
Output: 33
Explanation: The sum is calculated as 15+25=1+32=33.
Input: n = 3
Output: 276
Explanation: The sum is calculated as 15+25+35=1+32+243=276.*/

public class SumOfFifthPower {

    public static int sumOfFifthPowers(int n) {

        int sum = 0;
        for(int i=1; i<=n; i++) {

            int ans = 1;
            ans = i*i*i*i*i;
            sum += ans;

        }

        return sum;

    }

    public static void main(String[] args) {

        System.out.println(sumOfFifthPowers(3));
    }
}
