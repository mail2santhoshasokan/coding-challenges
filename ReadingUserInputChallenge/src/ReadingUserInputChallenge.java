import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while(count<=10){
            System.out.println("Enter the number #"+count);
            boolean hasInt = sc.hasNextInt();
            if (hasInt){
                int number = sc.nextInt();
                sum+=number;
            }else{
                System.out.println("Invalid Number");
            }
            sc.nextLine();
            count++;
        }

        sc.close();

        System.out.println("sum of ten numbers : "+sum);
    }
}
