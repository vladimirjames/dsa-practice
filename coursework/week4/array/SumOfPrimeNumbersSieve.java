package array;
/*Given a range [L, R]. The task is to find the sum of all the prime numbers in the given range from L to R both inclusive.
Input : L = 10, R = 20
Output : Sum = 60
Prime numbers between [10, 20] are:
        11, 13, 17, 19
Therefore, sum = 11 + 13 + 17 + 19 = 60
Input : L = 15, R = 25
Output : Sum = 59

Note: Use sieve of eratosthenes to solve the problem*/

import java.util.Arrays;

public class SumOfPrimeNumbersSieve {

    static int sumOfPrimeNumbers(int l, int r) {

        if(r < 2) {
            return 0;
        }
        int sum = 0;
        int[] isPrime = new int[r+1];
        Arrays.fill(isPrime,1);

        isPrime[0] = 0;
        isPrime[1] = 0;

        for (int i = 2; i*i <= r; i++) {

            if(isPrime[i] == 1) {

                for (int j = i*i; j <= r; j+=i) {

                    isPrime[j] = 0;

                }
            }
        }

        for (int i = l; i <= r; i++) {
            if(isPrime[i] == 1){
                sum += i;
            }
            
        }

        return sum;
    }


    public static void main(String[] args) {

        System.out.println(sumOfPrimeNumbers(15,25));

    }

}
