public class FindNthSeries {

    static int sumOfTheSeries(int n) {

        int sum = 0, totalSum = 0;
        for (int i = 1; i <= n ; i++) {

            sum += i;
            totalSum += sum;

        }

        return totalSum;
    }

    public static void main(String[] args) {

        System.out.println(sumOfTheSeries(6));

    }
}
