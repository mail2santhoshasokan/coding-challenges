public class HatchBack extends Car {

    private int doors;
    private String name;
    private int bootCapacity;
    private String fuelType;
    private int maxSpeed;
    private int noOfGear;

    public HatchBack(int engine, int engineCapacity, int power, String transmissionType, int gears, String steering, String carMaker, String bodyMaterial, int wheels, int doors, String name, int bootCapacity, String fuelType, int maxSpeed, int noOfGear) {
        super(1, engineCapacity, power, transmissionType, gears, steering, carMaker, bodyMaterial, wheels);
        this.doors = doors;
        this.name = name;
        this.bootCapacity = bootCapacity;
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
        this.noOfGear = noOfGear;
    }

    public int getDoors() {
        return doors;
    }

    public String getName() {
        return name;
    }

    public int getBootCapacity() {
        return bootCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getNoOfGear() {
        return noOfGear;
    }

    @Override
    public void handleSteering(String direction) {
        super.handleSteering(direction);
    }

    public void changingGears(int gear){
        if (gear<=this.noOfGear){
            System.out.println("shifting to gear" + gear);
            speed(gear);
        }else{
            System.out.println("");
        }
    }

    public void speed(int gear){
        switch (gear){
            case 1:
                System.out.println("travelling at speed 10 kmph");
                break;
            case 2:
                System.out.println("travelling at speed 30 kmph");
                break;
            case 3:
                System.out.println("travelling at 50 kmph");
                break;
            case 4:
                System.out.println("travelling at 70 kmph");
                break;
            case 5:
                System.out.println("travelling at 80 kmph");
                break;
            default:
                System.out.println("idling");
                break;
        }

    }
}
