package Collections;

import OneDimentionalArrays.RandomStringArray;
import arrayReview.Array;

import java.util.ArrayList;

public class RandomCharacters {
    public static void main(String[] args) {
        String letters="concatenation";
        System.out.println(letters.charAt((int)Math.random()*letters.length() ));
        ArrayList<String> words =new ArrayList<>();//Empty string ArrayList
        String word;
        for (int i = 0; i <100 ; i++) {
            word = "";
            for (int j = 0; j <5 ; j++) { //to concat.chars
                word += letters.charAt((int)(Math.random()*letters.length()));
            }
            words.add(word);
        }
        System.out.println(words);

    }
}
