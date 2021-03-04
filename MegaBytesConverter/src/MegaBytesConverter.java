public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int remainder = kiloBytes % 1024;
            int megabyte = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + megabyte + " MB and " + remainder + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
}
