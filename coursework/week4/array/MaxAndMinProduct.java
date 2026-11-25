package array;
/*
Max and Min Product from 2 Arrays
Given two arrays of arr1 and arr2, the task is to calculate the product of the maximum element of the first array arr1, and minimum element of the second array arr2.
Examples :
Input : arr1[] = [5, 7, 9, 3, 6, 2],  arr2[] = [1, 2, 6, 1, 9]
Output : 9
Explanation: The max in arr1 is 9. The min element in arr2 is 1. The product is 9*1 = 9.
Input : arr1[] = [0, 0, 0, 0],  arr2[] = [1, 1, 2]
Output : 0
*/


public class MaxAndMinProduct {

    public static long minMaxProduct(int[] arr1, int[] arr2) {

        long max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i = 0; i < arr1.length; i++) {

            if(arr1[i] > max) {
                max = arr1[i];
            }

        }

        for (int i = 0; i < arr2.length; i++) {

            if(arr2[i] < min) {
                min = arr2[i];
            }

        }

        return max * min;


    }

    public static void main(String[] args) {

        System.out.println(minMaxProduct(new int[] {5, 7, 9, 3, 6, 2}, new int[] {1, 2, 6, 1, 9}));
    }
}
