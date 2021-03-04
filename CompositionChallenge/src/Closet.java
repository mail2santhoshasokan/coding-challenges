public class Closet {

    private int racks;
    private int length;
    private int width;


    public Closet(int racks, int length, int width) {
        this.racks = racks;
        this.length = length;
        this.width = width;
    }

    public void sizeOfTheCloset(){
        System.out.println("Size of the closet : "+ this.length*this.width);
    }

    public int getRacks() {
        return racks;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
