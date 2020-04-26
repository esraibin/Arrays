package ReviewCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListWord {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(Arrays.asList("Java","is","extremely","fun"));
        List<Integer> lengths =new LinkedList<>();
        for(String word : list){
            lengths.add(word.length());
        }
        System.out.println(list);
        System.out.println(lengths);
        int index = lengths.indexOf(Collections.max(lengths));
        System.out.println("The largest word is : "+"\""+list.get(index)+"\""+" with the length of "+lengths.get(index));
    }
}
