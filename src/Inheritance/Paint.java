package Inheritance;

public class Paint {
    protected String colorName;
    protected double squareFeet;
    protected double totalPrice;

    public Paint(String colorName,double squareFeet,double totalPrice){
        this.colorName=colorName;
        this.squareFeet=squareFeet;
        this.totalPrice=0;
    }
    public double toPaint(){
        this.totalPrice=this.squareFeet/100*3.99;
        return this.totalPrice;

    }

    @Override
    public String toString() {
        return "Paint{" +
                "colorName='" + colorName + '\'' +
                ", squareFeet=" + squareFeet +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
