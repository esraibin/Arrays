package OneDimentionalArrays;

public class OddNumbersInArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11};
        int sum=0;
        for (int i = 0; i <array.length ; i++) {//to visit each number
            if(array[i]%2==1){ //to check odd number
                sum +=sum+array[i];


            }

        }
        System.out.println("Sum Of odd number; "+sum);
        int counter=0;
        for (int i = 0; i < array.length; i++) {

        }
        }
}

