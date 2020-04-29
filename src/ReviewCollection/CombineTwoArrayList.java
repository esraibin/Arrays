package ReviewCollection;

import arrayReview.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(4,5,6));
        System.out.println(combineTwoArrayList(arr1,arr2));
    }
    public static ArrayList<Integer> combineTwoArrayList(ArrayList<Integer>left,ArrayList<Integer> right){
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(left);
        result.addAll(right);
        return result;
    }
}
