package Inheritance;

public class CustomPaint extends Paint {
    String glossiness;
    String durability;


    public CustomPaint(String colorName,double squareFeet,double totalPrice, String glossiness,String durability){
        super(colorName,squareFeet,totalPrice);
        // super.colorName=colorName;
        // super.squareFeet  these or super(colorName,squareFeet,totalPrice); works
        this.glossiness=glossiness;
        this.durability=durability;

    }
    public void changeGloss(String newGloss){
        this.glossiness= newGloss;

    }
    public void changeDurability(String newDurable){
        this.durability= newDurable;

    }
    public double calculateCustomPrice(){

        double pricePerGallon=32.99;
        if(this.glossiness.equalsIgnoreCase("extra glossy")){
        totalPrice=pricePerGallon+3;
        }
        else if(this.glossiness.equalsIgnoreCase("glossy")){
        totalPrice= pricePerGallon+2;
        }
        return totalPrice;

        }

    }






