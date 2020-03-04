package OneDimentionalArrays;

public class RandomStringArray {
    public static void main(String[] args) {
        String[] arrayString = new String[20];

        for (int i = 0; i < arrayString.length; i++) {
            arrayString[i] = generateRandomWord();
        }
        for (String word : arrayString) {
            System.out.println(word);
        }

    }
    public static String generateRandomWord(){
        String word = "";
        //wordLength could be 1-6 included
        int wordLength= (int)(Math.random()*6+1);
        for(int i=0 ; i<wordLength; i++){
            // all lowercase letters
            word += (char)(int)((Math.random()*26+97));
        }
        return word;
    }
}

