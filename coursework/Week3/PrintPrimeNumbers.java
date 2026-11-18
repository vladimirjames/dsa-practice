/*Write a program that gets n as input and print all the prime numbers till that number.
Testcase 1 :
Input :
        5
Expected output:
        2 3 5

Testcase 2 :
Input :
        11
Expected output:
        2 3 5 7 11*/

public class PrintPrimeNumbers {

    public static void main(String[] args) {

        int n = 11;

        for (int i = 2; i <= n ; i++) {

            boolean isPrime = true;

            for (int j = 2; j < i ; j++) {

                if(i % j == 0) {

                    isPrime = false;
                    break;
                }

            }

            if (isPrime){
                System.out.println(i);
            }

        }
    }
}
