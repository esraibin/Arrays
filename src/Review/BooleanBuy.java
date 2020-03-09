package Review;

public class BooleanBuy {
    public static void main(String[] args) {

        String roadTested = "No";
        boolean mileage = true;
        boolean age = false;

            if(roadTested.equalsIgnoreCase("no")){
                if(mileage){
                    if(age){
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


