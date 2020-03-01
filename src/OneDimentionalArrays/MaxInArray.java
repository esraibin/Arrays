package OneDimentionalArrays;

public class MaxInArray {
    public static void main(String[] args) {
        int arrayNumber[] = {99,5,7,23,6,9};
        System.out.println(findMaxValue(arrayNumber));

    }
    public static  int findMaxValue(int[] arr){
        int max =arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
