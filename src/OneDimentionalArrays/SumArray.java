package OneDimentionalArrays;

public class SumArray {
    public static void main(String[] args) {
        int[] Array1 = {1,2,3,4,5,6,7,8};
        int sumOfArray=0;

        for (int i = 0; i <Array1.length ; i++) {
            sumOfArray+=Array1[i];// makes addition takes one item adds to current one and create new value

        }
        System.out.println(sumOfArray);

    }
}
