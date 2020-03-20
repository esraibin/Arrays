package ReviewMethodArrays;

public class LoopsForTen {
    public static void main(String[] args) {
        int[][] nums = createArray(10,10);


    }
    public static int [][] createArray(int rows,int cols){
        // to create Array size 10 1o
        int[][] numbersArray =new int[rows][cols];
        int number = 1;
        for (int i = 0; i <numbersArray.length ; i++) {
            for (int j = 0; j <numbersArray[i].length ; j++) {
                numbersArray[i][j]=number;
                number++;
            }

        }
        return numbersArray;

    }
}

