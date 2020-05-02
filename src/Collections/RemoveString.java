package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveString {
    public static void main(String[] args) {
        ArrayList <String> oldArray= new ArrayList<String>(Arrays.asList("Java","is","my","main","Language"));
        oldArray.remove(2);
        System.out.println(oldArray);
    }
}
