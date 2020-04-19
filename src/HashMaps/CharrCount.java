package HashMaps;

import java.util.HashMap;

public class CharrCount {
    public static void main(String[] args) {
        String test = "consequences";
        findFrequencyOfChars(test);

    }
    public static void findFrequencyOfChars(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        char key;
        int value;
        for (int i = 0; i <str.length() ; i++) {
            key= str.charAt(i);
            if(map.containsKey(str.charAt(i))){
              value = map.get(key);
              // increase 1 value of that key
              map.put(key,map.get(key)+1);
             }
            else{
                map.put(key,1);
            }
        }
        System.out.println(map);
        }
    }


