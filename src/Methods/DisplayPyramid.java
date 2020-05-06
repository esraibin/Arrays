package Methods;

public class DisplayPyramid {
    public static void displayPyramid(int numberOfLines){
        for (int i = 1; i < 20 ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        displayPyramid(3);
        displayPyramid(7);
        displayPyramid(5);
    }

    }



