/*Sample 1:
Input:
n = 4

Expected output:
        *
        **
        ***
        ****

Sample 2
Input:
n= 6

Expected output:
        *
        **
        ***
        ****
        *****
        ******
*/

public class Pattern8 {

    public static void main(String[] args) {
        
        int n = 6;

        for (int i = 0; i < n ; i++) {

            for (int j = 0; j < n ; j++) {
                
                if(i >= j) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        
    }
}
