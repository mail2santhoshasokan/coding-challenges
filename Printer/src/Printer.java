public class Printer {

    private boolean isDuplexPrinter;
    private int tonerLevel = 100;
    private int noOfPagesPrinted;

    public Printer(boolean isDuplexPrinter, int tonerLevel) {
        this.isDuplexPrinter = isDuplexPrinter;
        if (tonerLevel>=0 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }
        this.noOfPagesPrinted = 0;
    }

    public void fillUpTheToner(int level){
        if (this.tonerLevel+level<=100){
            this.tonerLevel+=level;
        }else{
            this.tonerLevel=100;
        }
    }

    public void printPages(int noOfPagesToPrint){
        if (noOfPagesToPrint<=tonerLevel){
            System.out.println("Printing "+ noOfPagesToPrint);
            this.tonerLevel-=noOfPagesToPrint;
            noOfPagesPrinted+=noOfPagesToPrint;
        }else{
            System.out.println("toner level is low, add more toner to print");
        }
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNoOfPagesPrinted() {
        return noOfPagesPrinted;
    }
}
