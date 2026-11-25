package array;
/*Palindrome Array
Difficulty: BasicAccuracy: 43.54%Submissions: 95K+Points: 1
Given an array arr[], the task is to find whether the arr is palindrome or not.  An array is said to be palindrome if its reverse array matches the original array.

        Examples:

Input: arr = [1, 2, 3, 2, 1]
Output: true
Explanation: If we reverse, we get [1, 2, 3, 2, 1] which is the same as before. So, the answer is true.
Input: arr = [1, 2, 3, 4, 5]
Output: false
Explanation:  If we reverse it, we get [5, 4, 3, 2, 1] which is the not same as before. So, the answer false.*/


public class PalindromeArray {

    public static boolean isPalindromeBruteForce(int[] arr) {

        int[] reverse = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            reverse[i] = arr[arr.length-1-i];

        }

        boolean ans = true;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != reverse[i]) {
                ans = false;
                break;
            }

        }

        return ans;

    }


    public static boolean isPalindrome(int[] arr) {

        int left = 0, right = arr.length-1;

        boolean ans = true;

        while (left < right) {

            if(arr[left] != arr[right]) {
                ans = false;
                break;
            }

            left++;
            right--;

        }

        return ans;

    }


    public static void main(String[] args) {

        System.out.println(isPalindrome(new int[] {1,2,3,2,1}));

    }
}
