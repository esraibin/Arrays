package OneDimentionalArrays;

public class SymmetricArray {
    public static void main(String[] args) {
        int myArr[] ={1,2,3,3,2,1};
        checkSymmetric(myArr);

    }
    public static void checkSymmetric(int[] arr){
        int index= arr.length-1;
        int counter=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] != arr[index]) {
                counter++;

            }
            index--;
        }
        if(counter==0){
            System.out.println("Symmetric");
        }
        else{
            System.out.println("Not Symmetric");
        }
    }
}
