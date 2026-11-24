package array;
/*
Count Odd and Even
Given an array arr[] of positive integers. The task is to return the count of the number of odd and even elements in the array.
        Note: Return two elements where the first one in the count of odd & second one is the count of even.
        Examples:
Input: arr[] = [1, 2, 3, 4, 5]
Output: 3 2
Explanation: There are 3 odd elements (1, 3, 5) and 2 even elements (2 and 4).
Input: arr[] = [1, 1]
Output: 2 0
Explanation: There are 2 odd elements (1, 1) and no even elements.
*/


import java.util.Arrays;

public class CountOddAndEven {

    public static int[] countOddEven(int[] arr) {

        int oddCount = 0, evenCount = 0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]%2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

        }

        return new int[] {oddCount, evenCount};

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(countOddEven(new int[] {1, 2, 3, 4, 5})));
    }
}
