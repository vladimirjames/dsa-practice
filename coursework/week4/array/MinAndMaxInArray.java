package array;
/*
Min and Max in Array
Given an array arr[]. Your task is to find the minimum and maximum elements in the array.
Examples:
Input: arr[] = [1, 4, 3, 5, 8, 6]
Output: [1, 8]
Explanation: minimum and maximum elements of array are 1 and 8.
Input: arr[] = [12, 3, 15, 7, 9]
Output: [3, 15]
Explanation: minimum and maximum element of array are 3 and 15.
*/

import java.util.ArrayList;

public class MinAndMaxInArray {

    public static ArrayList<Integer> getMinMax(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        int min = Integer.MAX_VALUE;// +
        int max = Integer.MIN_VALUE;// -

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] < min ) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }

        }

        list.add(min);;
        list.add(max);

        return list;

    }


    public static void main(String[] args) {

        System.out.println(getMinMax(new int[] {1, 4, 3, 5, 8, 6}));

    }
}
