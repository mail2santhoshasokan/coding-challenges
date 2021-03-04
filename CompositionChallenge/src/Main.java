public class Main {
    public static void main(String[] args) {

        BathRoom bathRoom = new BathRoom(12,12);

        Bed bed = new Bed("colonial",10,10,10);

        Closet closet  = new Closet(10, 10, 10);

        Room room = new Room(bed, bathRoom, closet);

        room.calculateSizeOfBed();
        room.calculateTheSizeOfBath();
        room.calculateTheSizeOfCloset();
    }
}
