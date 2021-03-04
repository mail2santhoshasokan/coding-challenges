public class Room {

    private Bed bed;
    private BathRoom bathRoom;
    private Closet closet;

    public Room(Bed bed, BathRoom bathRoom, Closet closet) {
        this.bed = bed;
        this.bathRoom = bathRoom;
        this.closet = closet;
    }

    public void calculateSizeOfBed(){
        getBed().sizeOfTheBed();
    }

    public void calculateTheSizeOfBath(){
        getBathRoom().sizeOfTheBath();
    }

    public void calculateTheSizeOfCloset(){
        getCloset().sizeOfTheCloset();
    }


    private Bed getBed() {
        return bed;
    }

    private BathRoom getBathRoom() {
        return bathRoom;
    }

    private Closet getCloset() {
        return closet;
    }
}
