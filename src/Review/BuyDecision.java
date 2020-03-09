package Review;

public class BuyDecision {
    public static void main(String[] args) {
        boolean roadTested= true;
        String mileage ="low";
        String age= "low";

        if(roadTested){
            if(mileage.equalsIgnoreCase("high")){
                if(age.equalsIgnoreCase("recent")){
                    System.out.println("BUY");
                }
                System.out.println("Don't buy");
            }
            else{
                System.out.println("Buy");
            }
            }
        else{
            System.out.println("DON'T BUY");
        }
    }
}
