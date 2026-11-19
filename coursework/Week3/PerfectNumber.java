public class PerfectNumber {

    static String perfectNumberBruteForce(int n) {

        int sum = 1;
        for (int i = 2; i < n ; i++) {

            if(n % i == 0) {
                sum += i;
            }

        }

        return (n == sum)? "Perfect Number" : "Not a Perfect Number";

    }

    static String perfectNumberOptimized(int n) {

        if(n <= 1) {
            return "Not a Perfect Number";
        }

        int sum = 1;
        for (int i = 2; i*i <= n; i++) {

            if(n%i == 0){
                sum += i;

                if(n/i != i) {
                    sum += n/i;
                }

            }

        }

        return (n == sum)? "Perfect Number" : "Not a Perfect Number";

    }

    public static void main(String[] args) {

        System.out.println(perfectNumberOptimized(1));

    }

}
