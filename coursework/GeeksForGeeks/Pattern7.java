/*
Sample 1:
Input:
n = 4
Expected output:
        4321
        321
        21
        1

Sample 2
Input:
n= 6
Expected output:
        654321
        54321
        4321
        321
        21
        1
*/

public class Pattern7 {

    public static void main(String[] args) {

        int n = 6;

        for (int i = n; i >= 1 ; i--) {

            for (int j = i; j >= 1 ; j--) {

                System.out.print(j + " ");

            }

            System.out.println();

        }

    }
}
