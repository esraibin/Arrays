package TwoDimentionalArrays;

import OneDimentionalArrays.RandomStringArray;

public class ArrayRandomTwoDimensional {
    public static void main(String[] args) {

        int arrayNumbers[][]= {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        for (int i = 0; i <arrayNumbers.length ; i++) {
            for (int j = 0; j <arrayNumbers[i].length ; j++) {
                arrayNumbers[i][j]= (int)(Math.random()*1000);
            }

        }
        for (int numberArray[]:arrayNumbers) {
            for (int number : numberArray){
                System.out.println(number);
            }

            }
        //Random String Array
        String[][] arrayWords = new String[4][7];
        for(int i=0; i<arrayWords.length ; i++){
            for(int j=0 ; j<arrayWords[i].length; j++){
                arrayWords[i][j]= RandomStringArray.generateRandomWord();

            }
        }
        for (String words[]: arrayWords){
            for (String word: words){
                System.out.format("\t%10s",word);
            }
            System.out.println();
        }

        }

}

