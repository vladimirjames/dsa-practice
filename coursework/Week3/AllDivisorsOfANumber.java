/*Given an integer n, return all the divisors of n in the ascending order.
Examples:
Input : n = 20
Output: 1 2 4 5 10 20
Explanation: 20 is completely divisible by 1, 2, 4, 5, 10 and 20.
Input: n = 21191
Output: 1 21191
Explanation: As 21191 is a prime number, it has only 2 factors(1 and the number itself).*/

import java.util.ArrayList;

public class AllDivisorsOfANumber {

    public static ArrayList<Integer> getDivisors(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> pairList = new ArrayList<>();


        for (int i = 1; i*i <= n ; i++) {

            int pair = n / i;
            if(n % i == 0) {
                list.add(i);

                if(pair != i) {
                    pairList.add(pair);
                }
            }

        }

        for (int j = pairList.size() - 1; j >= 0 ; j--) {

            list.add(pairList.get(j));

        }

        return list;
    }


    public static void main(String[] args) {

//        System.out.println(getDivisors(21191));
        System.out.println(getDivisors(36));


    }

}
