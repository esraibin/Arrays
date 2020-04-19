package HashMaps;

import java.util.HashMap;

public class FindingRepeatingWords {
    public static void main(String[] args) {
        String sentence = "the best way to learn java is practice way java using java and java";
        findDuplicates(sentence);
    }
    public static void findDuplicates(String sentence){
        sentence.toUpperCase();
        String [] words = sentence.split(" ");//to convert String Array- 1 word in each element
        //to find frequency of the words
        HashMap<String,Integer> wordCounts = new HashMap<>();
        for(String word : words){
            if(wordCounts.containsKey(word)){
                wordCounts.put(word,wordCounts.get(word)+1);
            }
            else{
            wordCounts.put(word,1);
            }
        }
        System.out.println("Repeating Words");
        for(String key : wordCounts.keySet()){
          if(wordCounts.get(key)>1){
              System.out.println("-----   "+key+" = \t"+wordCounts.get(key));

          }
        }


    }
}
