package OneDimentionalArrays;

public class MinInArray {
    public static void main(String[] args) {
        int [] numbers= {1,2,3,45,565,65,-6};
        System.out.println(findMinValue(numbers));

    }

    public static int findMinValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min=arr[i];
            }
        }
        return min;
    }
}