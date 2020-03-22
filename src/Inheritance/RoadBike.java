package Inheritance;

public class RoadBike extends Bicycle {
    int tireSize;
    int handleBarSize;

public RoadBike(int tireSize, int handleBarSize,int gear, int speed){
    //calls gear and speed from super class, super is object of the parent class
    super(gear,speed);
    this.tireSize= tireSize;
    this.handleBarSize= handleBarSize;
}
}
