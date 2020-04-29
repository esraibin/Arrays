package ReviewCollection;


import java.util.*;

public class CollectionsRandomNum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
        list.add((int) (Math.random()*1000));

        }
        System.out.println(list);
        System.out.println("Min value: " +Collections.min(list));
        System.out.println("Max value: " +Collections.max(list));
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Median : "+list.get(list.size()/2));
        System.out.println("Largest 3 : "+ list.get(list.size()-1)+"\t"+list.get(list.size()-2)+"\t"+ list.get(list.size()-3));
        System.out.println("Smallest  : "+ list.get(0)+"\t"+list.get(1)+"\t"+ list.get(2));


    }
}