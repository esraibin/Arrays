package OneDimentionalArrays;

public class MercingArrays { //merging given two arrays with method
    public static void main(String[] args) {
        int array1[] = {1,2,3,4,5,6,76};
        int array2[] = {1,4353,45,4,46,546,546,546,546};
        mergeArrays(array1,array2);

    }
    public static  void mergeArrays(int a[], int b[]){
        int lenMergedArray = a.length+b.length;
        int[] mergedArray = new int[lenMergedArray];
        //adding value of the first array(array a)
        for(int i=0 ; i<a.length; i++){
            mergedArray[i] = a[i];
        }
        //adding elements of the second array (array b)
        int index=0;
        for (int i = a.length; i <mergedArray.length ; i++) {
            mergedArray[i]=b[index];
            index++;

        }
        // to print (show) elements

        for(int i=0; i<mergedArray.length;i++){
            System.out.println(mergedArray[i]);
        }
    }


}
