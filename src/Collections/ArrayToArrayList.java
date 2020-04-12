package Collections;

import arrayReview.Array;

import java.util.ArrayList;

public class ArrayToArrayList {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> convertToArrayList(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        for (int element: arr) {
            result.add(element);
        }
        return result;
    }
}
