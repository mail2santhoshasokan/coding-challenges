public class EqualSumChecker {

    public static boolean hasEqualSum(int numberOne, int numberTwo, int sum) {
        if (numberOne + numberTwo == sum) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(-1, 1, 0));
    }
}
