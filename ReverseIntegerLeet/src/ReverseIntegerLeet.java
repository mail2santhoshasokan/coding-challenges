public class ReverseIntegerLeet {
    public static int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }

        if (rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }else{
            return (int)rev;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(-153423646));
    }
}
