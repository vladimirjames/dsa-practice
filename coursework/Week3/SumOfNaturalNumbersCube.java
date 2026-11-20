/*Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.
Examples:
Input: n = 5
Output: 225
Explanation: 13 + 23 + 33 + 43 + 53 = 225
Input: n = 7
Output: 784
Explanation: 13 + 23 + 33 + 43 + 53 + 63 + 73 = 784*/

public class SumOfNaturalNumbersCube {

    static int sumOfSeries(int n) {

        int sum = 0;
        for (int i = 1; i <= n ; i++) {

            int ans = 1;
            ans = i*i*i;
            sum = sum + ans;

        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumOfSeries(5));

    }

}
