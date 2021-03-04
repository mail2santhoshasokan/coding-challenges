public class Main {
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        sumCalculator.setFirstNumber(10.0);
        sumCalculator.setSecondNumber(10.0);
        System.out.println(sumCalculator.getAdditionResult());
    }
}
