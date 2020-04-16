package Collections.Today;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.jar.JarOutputStream;

public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>(Arrays.asList("Java", "is", "always", "super", "fun"));
        int longest = 0;
        int index = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).length() > longest) {
                longest = myList.get(i).length();
                index = i;
                System.out.println(myList.get(i));
            }
        }
        System.out.println("The longest element is " + longest);
    }

    public static void findShortestWord(LinkedList<String> arr) {
        int shortest = arr.get(0).length();
        String shortestWord= "";
        for (int i = 1; i < arr.size(); i++){
            if(arr.get(i).length()<shortest){
            shortest= arr.get(i).length();
            shortestWord= arr.get(i);
            }
        }
        System.out.println("shortest word is "+shortestWord);
    }

}
