package ReviewCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Java"+ "is"+ "fun"));
        String arr[] = new String[list.size()];
        arr =list.toArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
