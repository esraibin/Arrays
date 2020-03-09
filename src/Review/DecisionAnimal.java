package Review;

public class DecisionAnimal {
    public static void main(String[] args) {
        boolean breatheAir= true;
        boolean layEggs=true;

        if(breatheAir){
            if(layEggs){
                System.out.println("Bird");
            }
            else{
                System.out.println("Mammal");
            }
        }
        else{
            System.out.println("fish");
        }

    }
}
