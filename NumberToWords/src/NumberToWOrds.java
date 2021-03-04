public class NumberToWOrds {

    public static void printNumberToWords(int number) {

        if (number<0){
            System.out.println("Invalid Value");
        }
        int original = number;
        number = reverse(number);
        int lastDigit;
        int count = 0;
        while (number >= 0 && count < getDigitCount(original)) {
            lastDigit = number % 10;
            number /= 10;
            count++;
            switch (lastDigit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;

        while (number != 0) {
            reverse = (reverse * 10) + number % 10;
            number = number / 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        String num = Integer.toString(number);
        return num.length();
    }

    public static void main(String[] args) {
        printNumberToWords(-1000);
    }

}
