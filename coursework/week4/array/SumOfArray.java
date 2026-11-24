package array;
/*Sum of Array
Given an integer array arr[], return the sum of all elements of arr.
        Examples:
Input: arr[] = [1, 2, 3, 4]
Output: 10
Explanation: 1 + 2 + 3 + 4 = 10.
Input: arr[] = [1, 3, 3]
Output: 7
Explanation: 1 + 3 + 3 = 7.*/


public class SumOfArray {

    public static int arraySum(int arr[]) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(arraySum(arr));
    }
}
