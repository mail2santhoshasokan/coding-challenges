public class LastDigitChecker {

    public static boolean hasSameLastDigit(int first, int second, int third) {
        if (!isValid(first)) {
            return false;
        }
        if (!isValid(second)) {
            return false;
        }
        if (!isValid(third)) {
            return false;
        }
        int firstDigit = first % 10;
        int secondDigit = second % 10;
        int thirdDigit = third % 10;
        if (firstDigit == secondDigit || firstDigit == thirdDigit || secondDigit == thirdDigit) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
    }
}
