/*You are given an integer n. Your task is to find if it is a palindrome.
Examples:
Input: n = 555
Output: true
Explanation: The number 555 reads the same backward as forward, so it is a palindrome.
Input: n = 123
Output: false
Explanation: The number 123 reads differently backward (321), so it is not a palindrome.
Input: n = -121
Output: true
Explanation: if number is palindrome, mainly ignore sign.*/


public class Palindrome {

    public static boolean isPalindrome(int n) {

        n = Math.abs(n);
        int original = n, rev = 0, rem = 0;

        while (n > 0) {

            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;

        }

        return original == rev;

    }

    public static void main(String[] args) {

        boolean ans = isPalindrome(-6);
        System.out.println(ans);

    }
}
