package errorHandiling;

public class nullPointer {
    public static void main(String[] args) {

        try{
            String s= null;
            System.out.println(s.length());
        }
        catch(ArithmeticException e){
            System.out.println("Aritmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Out of Bound Exception");
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception");

        }catch (Exception e){
            System.out.println("Parent Exception");
        }
        System.out.println("Rest of the code");

    }
}
