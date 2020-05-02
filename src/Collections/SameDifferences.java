package Collections;

import java.util.ArrayList;

public class SameDifferences {
    public static void main(String[] args) {
         int myNums[] = {2,4,6,8};
         ArrayList<Integer> dups = findSameDifferences(myNums);
        System.out.println(findDuplicates(dups));
    }
    public static ArrayList<Integer> findSameDifferences(int[] arr){
        ArrayList<Integer> diffs = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                diffs.add(Math.abs(arr[i]-arr[j]));

            }

        }
        diffs = findDuplicates(diffs);
        return diffs;
    }
    public static ArrayList<Integer> findDuplicates(ArrayList<Integer> arr){
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i =0 ; i<arr.size() ; i++){
            for(int j=i+1 ; j< arr.size(); j++){
                if(arr.get(i).equals(arr.get(j))){
                    duplicates.add(arr.get(i));

                }

            }
        }
        return duplicates;
    }
}
