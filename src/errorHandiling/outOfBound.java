package errorHandiling;

public class outOfBound {
    public static void main(String[] args) {
        try{
            int arr[] = {1,3,5,7};
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }
}