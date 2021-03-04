public class Floor {
    private double length;
    private double width;

    public Floor(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        if (this.length<0){
            this.length = 0;
        }
        if (this.width<0){
            this.width=0;
        }
        return this.width * this.length;
    }
}
