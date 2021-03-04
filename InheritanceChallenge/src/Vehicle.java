public class Vehicle {

    public int engine;
    public int engineCapacity;
    public int power;
    public String transmissionType;
    private int gears;
    private String steering;

    public Vehicle(int engine, int engineCapacity, int power, String transmissionType, int gears, String steering) {
        this.engine = engine;
        this.engineCapacity = engineCapacity;
        this.power = power;
        this.transmissionType = transmissionType;
        this.gears = gears;
        this.steering = steering;
    }

    public int getEngine() {
        return engine;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getPower() {
        return power;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public int getGears() {
        return gears;
    }

    public String getSteering() {
        return steering;
    }

    public void handleSteering(String direction){
        if (direction.equals("left")){
            System.out.println("Steering in left direction");
        } else if (direction.equals("right")){
            System.out.println("Steering in right direction");
        }else{
            System.out.println("Steering straight");
        }
    }
}
