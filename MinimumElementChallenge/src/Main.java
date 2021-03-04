import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(){
        System.out.println("Enter the length of the array \r");
        int length = scanner.nextInt();
        int[] myIntArray = new int[length];
        System.out.println("Array of length "+myIntArray.length+" is created");
        System.out.println("Enter the values : \r");
        for (int i=0;i<myIntArray.length;i++){
            myIntArray[i] = scanner.nextInt();
        }
        System.out.println("finished writing to array");
        return myIntArray;
    }

    public static void printArray(int[] myArray){
        for (int i=0;i<myArray.length;i++){
            System.out.println("Position " +i+ ", the value is "+myArray[i]);
        }
    }

    public static int findMin(int[] array){
        int min = array[0];
        for (int i=1;i<array.length;i++){
            if (min>array[i]){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] myIntArray =  getIntegers();
        printArray(myIntArray);
        System.out.println(findMin(myIntArray));
    }
}
