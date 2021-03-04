public class NumberPalindrome {

    public static boolean isPalindrome(int x) {
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return false;
        }
        int original = x;
        int temp = 0;
        int pop;

        while (x != 0) {
            pop = x % 10;
            x /= 10;
            temp = temp * 10 + pop;
        }

        if (original < 0) {
            return false;
        } else if (original == temp) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        //System.out.println(isPalindrome(707));
        //System.out.println(isPalindrome(11212));
    }

}
