package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWindow {
    public static void main(String[] args) {
        int[] window = {1,2};
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>());
        matrix.get(0).addAll(Arrays.asList(1,2,3,4)); //1*2; 2*2; 1*3; 2*4;
        matrix.add(new ArrayList<>());
        matrix.get(1).addAll(Arrays.asList(5,6,7,8));
        System.out.println(matrix);
        matrix.add(new ArrayList<>());
        matrix.get(2).addAll(Arrays.asList(9,10,11,12));
        applyingWindowing(matrix,window);
    }
    public static void applyingWindowing(ArrayList<ArrayList<Integer>> arr, int[] window){
        int num;
        for (int i= 0 ; i< arr.size(); i++){
            for (int j = 0; j <arr.get(i).size() ; j+=2) {
                num= arr.get(i).get(j)*window[0];
                arr.get(i).set(j,num);
                num = arr.get(i).get(j+1)*window[1];
                arr.get(i).set(j+1,num);
            }

        }
        for(ArrayList<Integer> a: arr){
            System.out.println(a);
        }
    }

}
