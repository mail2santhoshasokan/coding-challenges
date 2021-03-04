class Car {
    public String name;
    public boolean engine;
    public int wheels;
    public String cylinders;

    public Car(String name,String cylinders) {
        this.name = name;
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
    }

    public String startEngine(){
        return "Starting Engine";
    }

    public String accelerate(){
        return "accelerating";
    }

    public String brake(){
        return "braking now";
    }

    public String getName() {
        return name;
    }

    public String getCylinders() {
        return cylinders;
    }
}

class Benz extends Car{

    public Benz(String name, String cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "starting bi turbo engine";
    }

    @Override
    public String accelerate() {
        return "Acceleration of c class is 5 s";
    }

    @Override
    public String brake() {
        return "Braking power in c class is 45 m";
    }
}

class Bmw extends Car {

    public Bmw(String name, String cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "starting m 5 engine";
    }

    @Override
    public String accelerate() {
        return "Acceleration of 3 series is 6 s";
    }

    @Override
    public String brake() {
        return "Braking power in 3 series is 50 m";
    }
}

class Porsche extends Car{

    public Porsche(String name, String cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "starting w8 engine";
    }

    @Override
    public String accelerate() {
        return "Acceleration of 911 is 4 s";
    }

    @Override
    public String brake() {
        return "Braking power in 911 is 45 m";
    }
}

class Main{

    public static Car getCar(){
        int randomNumber = (int) Math.random()*2+1;
        switch (randomNumber){
            case 1:
                return new Benz("c class", "6 cylinder");
            case 2:
                return new Bmw("3 series", "4 cylinder");
            case 3:
                return new Porsche("911", "8 cylinder");
        }
        return new Car("default","default");

    }

    public static void main(String[] args) {
        for (int i =0;i<10;i++){
            Car car = getCar();
            System.out.println(car.getName());
            System.out.println(car.getCylinders());
            System.out.println(car.accelerate());
            System.out.println(car.startEngine());
            System.out.println(car.brake() + "\n");
        }
    }

}


