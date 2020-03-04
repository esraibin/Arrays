package TwoDimentionalArrays;

public class FirstTwoDimensionalArray {
    public static void main(String[] args) {
        //creates new array 3 by  3
        int array[][]= new int[3][3];
        int counter =1;
        //to insert/create number 1-9
        for (int i=0; i< array.length; i++){
            for (int j = 0; j <array[i].length ; j++) {
                // assigning number to current element(cell)
                array[i][j]=counter;
                counter++;

            }
        }
            // to print all elements of the array
        for (int i = 0; i <array.length ; i++) {
            //for every iteration of outher lop it will return an array
            for (int number: array[i]){
                System.out.print("\t\t"+number);

            }
            System.out.println();
        }
    }

}

