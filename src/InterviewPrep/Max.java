package InterviewPrep;

import arrayReview.Array;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {7, 5, 8, 3, 99};
        System.out.println(findMAx(arr));
        //second way
        Arrays.sort(arr);


    }

    public static int findMAx(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
