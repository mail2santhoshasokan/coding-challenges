public class ReverseInteger {
    static int reverse(int x) {
        int remainder = 0;
        int reverse = 0;
        boolean isNegative = false;
        if (x < 0) {
            x = x * -1;
            isNegative = true;
        }
        StringBuilder  builder = new StringBuilder();
        builder.append(x);
        Integer.parseInt("-"+builder.toString());
        while (x != 0) {
            remainder = x % 10;
            if ((reverse * 10) < 2147483647){
                reverse = reverse * 10 + remainder;
                x = x / 10;
            }else{
                return  0;
            }

        }
        return isNegative == true ? reverse * -1 : reverse;
    }

    public static void main(String[] args) {
        int r = reverse(1534236469);
        System.out.println(r);
    }
}
