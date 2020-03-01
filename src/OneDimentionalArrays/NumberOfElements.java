package OneDimentionalArrays;

public class NumberOfElements {
    public static void main(String[] args) {
        String[] array = {"abc","defgh","qwerty","asd"};
        int counter=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i].length()<4){
                counter++;
            }

        }
        System.out.print(counter);
    }
}
