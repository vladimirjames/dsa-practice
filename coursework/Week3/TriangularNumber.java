public class TriangularNumber {

    static int isTriangular(int n) {

        int i = 1;
        while (true) {

            int triangularNumber = i * (i+1)/2;

            if(triangularNumber == n) {
                return 1;
            } else if(triangularNumber > n) {
                return 0;
            }
            i++;
        }
    }

    public static void main(String[] args) {

        System.out.println(isTriangular(55));

    }
}
