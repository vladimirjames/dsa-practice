/*
           *
          ***
         *****
        *******
*/
public class Pattern10 {

    public static void printPyramid(int n) {

        for (int i = 1; i <= n ; i++) {

            for (int j = n; j > i ; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j < 2*i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 4;
        printPyramid(n);

    }

}
