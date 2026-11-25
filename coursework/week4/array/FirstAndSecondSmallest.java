package array;
/*First and Second Smallests
Given an array, arr[] of integers, your task is to return the smallest and second smallest element in the array. If the smallest and second smallest do not exist, return -1.
Examples:
Input: arr[] = [2, 4, 3, 5, 6]
Output: [2, 3]
Explanation: 2 and 3 are respectively the smallest and second smallest elements in the array.
Input: arr[] = [1, 1, 1]
Output: [-1]
Explanation: Only element is 1 which is smallest, so there is no second smallest element.*/

import java.util.ArrayList;
import java.util.Arrays;


public class FirstAndSecondSmallest {

    public static ArrayList<Integer> minAnd2ndMin(int[] arr) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] < smallest) {

                secondSmallest = smallest;
                smallest = arr[i];

            } else if (arr[i] > smallest && arr[i] < secondSmallest) {

                secondSmallest = arr[i];

            }

        }

        if(secondSmallest == Integer.MAX_VALUE) {

            list.add(-1);
            return list;

        } else {

            list.add(smallest);
            list.add(secondSmallest);

        }

        return list;

    }

    public static void main(String[] args) {

        int[] arr = {1,1,1};
        System.out.println(minAnd2ndMin(arr));


    }
}


