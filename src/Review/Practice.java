package Review;

public class Practice {
    public static void main(String[] args) {
        Boolean Id =true;
        Boolean ITId=true;

        if (Id || ITId){
            System.out.println("Welcome the building" );
            if(ITId)
                System.out.println("Welcome to IT room");
            else {
                System.out.println("You can not enter IT room");
            }
        }

        else {
            System.out.println("Access denied");
        }

    }
}
