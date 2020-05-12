package arrayReview;

public class duplicate {
    public static void main(String[] args) {
        String []myArr ={"abc","def", "abc","ddd","def"};
        printDuplicates(myArr);
    }
    public static void printDuplicates(String[] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i ; j<arr.length; j++) {
                if(arr[j].equals(arr[i]) && i!=j){// decide duplicates and prevents double writing
                    System.out.println(arr[j]);
                }

            }

        }
    }
}
