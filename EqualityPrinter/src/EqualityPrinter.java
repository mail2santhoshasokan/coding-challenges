public class EqualityPrinter {
    public static void printEqual(int first, int second, int third){
        if (first>=0 && second >= 0 && third >= 0 ){
            if (first == second && first == third && second == third){
                System.out.println("All numbers are equal");
            }else if (first !=second && first !=third && second !=third){
                System.out.println("All numbers are different");
            }else{
                System.out.println("Neither all are equal or different");
            }
        }else{
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args) {
        printEqual(1,2,3);
    }
}
