package ReviewCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        shiftToLeft(list,2);
    }
    public static void shiftToLeft(List<Integer> arr, int shiftNum){
        for (int i = 0; i <shiftNum ; i++) {
            arr.remove(0);

        }
        arr.remove(shiftNum);
        System.out.println(arr);
    }
}
