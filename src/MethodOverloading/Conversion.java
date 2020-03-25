package MethodOverloading;

public class Conversion {
    public static void main(String[] args) {
        convertLength(43.5);
        convertLength(30);

    }
    //inch to cm
    public static void convertLength( double length){
        System.out.println(length*2.54+"cm");
    }
    // cm to inch
    public static void convertLength(int length){
        System.out.println(length/2.54+"inch");
    }
}
