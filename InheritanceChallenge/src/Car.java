public class Car extends Vehicle{

    private String carMaker;
    private String bodyMaterial;
    private int wheels;

    public Car(int engine, int engineCapacity, int power, String transmissionType,  int gears, String steering, String carMaker, String bodyMaterial, int wheels) {
        super(engine, engineCapacity, power, transmissionType, gears, steering);
        this.carMaker = carMaker;
        this.bodyMaterial = bodyMaterial;
        this.wheels = wheels;
    }

    public String getCarMaker() {
        return carMaker;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public int getWheels() {
        return wheels;
    }
}
