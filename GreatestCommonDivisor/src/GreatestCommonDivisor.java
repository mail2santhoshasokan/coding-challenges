public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int a, int b) {
        if (a < 10 || b < 10) {
            return -1;
        }

        int count=0;

        while (a != b) {
            if (a > b) {
                a = a - b;
            }
            if (b > a) {
                b = b - a;
            }
            count++;
        }

        System.out.println("++++"+count);
        return Math.abs(a);
    }

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(81, 153));
    }
}
