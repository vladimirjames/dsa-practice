package array;
/*Sieve of Eratosthenes (ALGORITHM FOR PRIME NUMBER)
Difficulty: MediumAccuracy: 47.43%Submissions: 85K+Points: 4
Given a positive integer n, calculate and return all primes less than or equal to n using the Sieve of Eratosthenes algorithm.

Examples:

Input: n = 10
Output: [2, 3, 5, 7]
Explanation: Prime numbers less than equal to 10 are 2, 3, 5 and 7.
Input: n = 35
Output: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31]
Explanation: Prime numbers less than equal to 35 are 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 and 31.*/

import java.util.ArrayList;
import java.util.Arrays;


public class SieveOfEratosthenes {

    public static ArrayList<Integer> sieve(int n) {

        ArrayList<Integer> list = new ArrayList<>();

        if(n < 2) {
            return list;
        }

        int[] isPrime = new int[n+1];

        Arrays.fill(isPrime, 1);
        isPrime[0] = 0;
        isPrime[1] = 0;

        for (int i = 2; i*i <= n ; i++) {

            if(isPrime[i] == 1) {

                for (int j = i*i; j <= n; j+=i) {

                    isPrime[j] = 0;

                }
            }
        }

        for (int i = 0; i < isPrime.length; i++) {

            if(isPrime[i] == 1) {
                list.add(i);
            }

        }

        return list;

    }

    public static void main(String[] args) {

        System.out.println(sieve(10));

    }
}
