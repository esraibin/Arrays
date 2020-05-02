package Collections;

import arrayReview.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplicationOfArrays {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(2,-5,4,-2));
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(6,4,-5,-2));
        Multi(arr1,arr2);
    }
    public static void Multi(ArrayList<Integer> arr1,ArrayList<Integer> arr2){

        for (int i= 0; i <= arr1.size()-1; i++){
            System.out.println(arr1.get(i)*arr2.get(i));

            }

    }
}
