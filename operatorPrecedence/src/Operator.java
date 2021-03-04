public class Operator {
    public static void main(String[] args) {
        double firstDouble = 20.00;
        double secondDouble = 80.00;
        double result = (firstDouble + secondDouble)*100;
        double remainder = result % 40;
        boolean flag = (remainder == 0) ? true : false;

        System.out.println("boolean" + flag);

        if (!flag){
            System.out.println("got some remainder");
        }

    }
}
