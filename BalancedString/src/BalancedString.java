public class BalancedString {
    public static int balancedStringSplit(String s) {
        int lChars = 0;
        int rChars = 0;
        int balanced = 0;
        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length;i++){
            if (chars[i] == 'L'){
                lChars++;
            }
            if (chars[i] == 'R'){
                rChars++;
            }

            if (lChars == rChars){
                balanced++;
                lChars = 0;
                rChars = 0;
            }
        }
        return balanced;
    }
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("LLRR"));
    }
}
