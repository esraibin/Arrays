package OneDimentionalArrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arrayInt ={1,2,3,4,5,6,7,8,9};
        String[] arrayString={"Hello","Java","It","is","good","to","see","you"};
        for(int number: arrayInt){
            System.out.println(number);
        }
        // we can write with or without braces for this for
        for (String word : arrayString) System.out.println(word);
    }
}
