public class MeasurementCalculator {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 || (inches >= 0 || inches <= 12)) {
            double feetToInches = feet * 12;
            inches += feetToInches;
            double inchesToCentimeters = inches * 2.54;
            return inchesToCentimeters;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches > 0) {
            double feet = (int) inches / 12;
            double inch = inches % 12;
            System.out.println("feet" + feet + "inches" + inch);
            return calcFeetAndInchesToCentimeters(feet, inch);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        System.out.println(calcFeetAndInchesToCentimeters(157));
    }
}
