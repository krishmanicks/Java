package src.main.java;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int y = x;

        while (x > 0) {
            reverse = (reverse * 10) + (x % 10);
            x = x / 10;
        }

        if (y == reverse) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean s = palindromeNumber.isPalindrome(121);
        System.out.println(s);
    }
}
