package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListManipulations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
         ArrayList<Integer> container= new ArrayList<>();
        for (int i = numbers.size()-1; i >= 0; i--) {
            container.add(numbers.get(i));
        }
        System.out.println(container);
        // Solution with 1 ArrayList
        int temp;
        int index= numbers.size()-1;
        // to iterate to till middle of the array to avoid mirror effect
        for (int i = 0; i <numbers.size()/2 ; i++) {
        temp = numbers.get(i);
        numbers.set(i,numbers.get(index));
        numbers.set(index,temp);
        }
        System.out.println();
    }

}
