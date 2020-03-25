package MethodOverloading;

public class Test {
    public static void main(String[] args) {
        System.out.println(calculateCost(9.99,0.8));
        System.out.println(calculateCost(9.99,0.8,2.67));

    }
    public static double calculateCost(double price, double tax){
        double totalPrice = (price+tax)*1.1;
        return totalPrice;
    }
    public static double calculateCost(double price,double tax,double shipping){
        double totalPrice = (price+tax)*1.1+shipping;
        return totalPrice;
    }
}
