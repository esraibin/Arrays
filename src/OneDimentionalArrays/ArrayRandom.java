package OneDimentionalArrays;

public class ArrayRandom {// between 1000 and 5000

    public static void main(String[] args) {
        createArrayWithRandom(5);
    }

    public static void createArrayWithRandom(int n){
     int arr[]= new int[n];
     for(int i =0 ; i< arr.length;i++){
         arr[i]=(int)(1000+Math.random()*4000);
     }
     //just to see array elements
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }

    }
}
