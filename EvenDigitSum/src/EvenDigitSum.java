public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        if (number<0){
            return -1;
        }
        int sum=0;
        while(number!=0){
            int remainder = number%10;
            number/=10;
            if (remainder%2==0){
                sum+=remainder;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));

    }

}
