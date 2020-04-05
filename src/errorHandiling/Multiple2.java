package errorHandiling;

public class Multiple2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        try{
            System.out.println(arr[10]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of Bound Exception");
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Ecxeption");

        }catch(Exception e){
            System.out.println("Parent Exeption");
        }
        System.out.println("Rest of the code");

    }
}
