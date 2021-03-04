public class SharedDigit {
    public static boolean hasSharedDigit(int first, int second){
        if (first<10 || first>99 || second<10 || second > 99){
            return false;
        }
        int firstUnitDigit = first%10;
        int firstTenDigit = first/10;
        int secondUnitDigit = second%10;
        int secondTenDigit = second/10;

        if (firstUnitDigit == secondUnitDigit || firstUnitDigit == secondTenDigit || firstTenDigit == secondUnitDigit || firstTenDigit == secondTenDigit){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }
}
