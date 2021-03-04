public class DecimalComparator {
    public static boolean comparator(double firstDouble, double secondDouble){
        int one = (int)(firstDouble*1000);
        int second = (int)(secondDouble*1000);
        if (one == second){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(comparator(3.175,3.176));
    }
}
