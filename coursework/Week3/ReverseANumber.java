/*Write a program that gets n as input and print the reverse of the number
Testcase 1 :
Input :
        325345
Expected output:
        543523

Testcase 2 :
Input :
        987987
Expected output:
        789789*/

public class ReverseANumber {

    public static void main(String[] args) {

        int num = 325345;

        int rev = 0;

        while (num > 0) {

            rev = (rev * 10) + (num%10);
            num = num / 10;

        }

        System.out.println(rev);

    }
}
