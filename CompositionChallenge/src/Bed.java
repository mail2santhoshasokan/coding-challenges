public class Bed {

    private String bedType;
    private int width;
    private int length;
    private int height;

    public Bed(String bedType, int width, int length, int height) {
        this.bedType = bedType;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void sizeOfTheBed(){
        System.out.println("Size of the bed is : "+this.height*this.length*this.width);
    }

    public String getBedType() {
        return bedType;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
