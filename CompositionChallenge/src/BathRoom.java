public class BathRoom {

    private int width;
    private int length;

    public BathRoom(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public void sizeOfTheBath(){
        System.out.println("The size of the bathroom is " + this.length*this.width);
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
