package OneDimentionalArrays;

public class SymetricArray {
    public static void main(String[] args) {
        int myArr[] ={1,2,3,3,2,1};
        checkSymetric(myArr);

    }
    public static void checkSymetric(int[] arr){
        int index= arr.length-1;
        int counter=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] != arr[index]) {
                counter++;

            }
            index--;
        }
        if(counter==0){
            System.out.println("Symetric");
        }
        else{
            System.out.println("Not Symetric");
        }
    }
}
