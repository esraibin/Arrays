package Inheritance;

public class BikeTests {
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle(30,10);
        myBike.slowDown();
        RoadBike myRoadBike = new RoadBike(29,60,40,30);
        myRoadBike.speedUp();
    }
}
