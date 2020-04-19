package HashMaps;

import java.util.HashMap;

public class MaxPair {
    public static void main(String[] args) {
        int arr[] ={1,2,3,5,2,4};
        findMAxAdjacent(arr);

    }
    public static void findMAxAdjacent(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length-1; i++) {
            hm.put(i,arr[i]*arr[i+1]);
        }
        int max = 0;
        int index = 0;
        //System.out.println(hm);
        for(int key : hm.keySet()){
            if(hm.get(key)>max){
                max=hm.get(key);
                index = key;
            }

        }
        System.out.println("index 1 :\t"+index+
                "\tindex 2 :\t"+(index+1)+"\n"+ "Max multiplication  is :   "+arr[index]+"*"+arr[index+1]+" = "+max );

    }
}
