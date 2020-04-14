package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayList {
    public static  void main(String[] args) {
        ArrayList<ArrayList<String>> words = new ArrayList<>();
        ArrayList<String> a = new ArrayList(Arrays.asList("Java", "is","fun"));
        words.add(a);
        words.add(a);
        words.get(1).add("AAAAA");
        System.out.println(words);
        findUpperCases(words);
        findLowerCases(words);

    }
    public static void findUpperCases(ArrayList<ArrayList<String>> arr){
        int counterWord;
        int counterRow;
        for (int i = 0; i <arr.size() ; i++) { // to fetch 1 dim String arrays
            counterRow=0;
            for (int j = 0; j <arr.get(i).size() ; j++) {//to fetch String elements
                counterWord=0;
                for (int k = 0; k <arr.get(i).get(j).length() ; k++) { //to fetch chars
                    if(Character.isUpperCase(arr.get(i).get(j).charAt(k))){
                        counterWord++;
                    }

                }
                counterRow += counterWord;
            }
            System.out.println("There is " +counterRow+"upper cases at row");

        }
    }
    public static void findLowerCases(ArrayList<ArrayList<String>> arr){
        int countInWord;
        int countInRow;
        for (int i = 0; i <arr.size() ; i++) {
            countInRow=0;
            for (int j = 0; j <arr.get(j).size() ; j++) {
                countInWord=0;
                for (int k = 0; k <arr.get(i).get(j).length() ; k++) {
                    if (Character.isLowerCase(arr.get(i).get(j).charAt(k))){
                        countInWord++;


                    }

                }
                countInRow +=countInWord;

            }
            System.out.println("There are "+ countInRow+"lower cases on row "+(i+1));

        }
    }
    public static void findUpperCasesInWords(ArrayList<ArrayList<String>> arr){
        int countWord;
        for (int i = 0; i < arr.size() ; i++) {
            for (int j = 0; j < arr.get(i).size() ; j++) {
                countWord=0;
                for (int k = 0; k <arr.get(i).get(j).length() ; k++) {
                    if(Character.isUpperCase(arr.get(i).get(j).charAt(k))) {
                        countWord++;
                    }
                }
                System.out.println("There are "+countWord+"uppercases in "+arr.get(i).get(j));
            }
        }
    }
}
