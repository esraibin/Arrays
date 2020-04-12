package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class shiftToLeft {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(3,5,7,9,7,4));
        shiftToLeft(list,2);

    }
    public static void shiftToLeft(ArrayList<Integer> numbers,int shiftNum){
        for (int i = 0; i < shiftNum ; i++) {
        numbers.remove(0);
        }

        System.out.println(numbers);
    }
}
