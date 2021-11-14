package Section_7;


import Section_7.Challenge.*;

public class Main {
    public static void main(String[] args) {
        /*
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","240", dimensions);
        Monitor monitor = new Monitor("27inch Beast","Acer", 27, new Resolution(2540,1440));
        Motherboard motherboard = new Motherboard("BJ-200","Asus", 4,6,"v2.44");
        PC thePC = new PC(theCase,monitor,motherboard);
        thePC.powerUp();
        */

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(2500, 55);

        Bed bed = new Bed("Rural",4,800, 2,2);

        Lamp lamp = new Lamp("Provance",false,1234);
        Bedroom bedRoom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp) ;
        bed.make();
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }
}
