package errorHandiling;

public class AritheticException {
    public static void main(String[] args) {
        try {
            //we can not see the code but still java continue to work
            int data = 3 / 0;
            System.out.println("code");
        } catch (ArithmeticException e) {
            System.out.println(e);

        }
        int i =50;
        int j = 0;
        int data;

        try{
            data= i/j;
            System.out.println(data);
        }
        catch(Exception e){
            System.out.println(i/(j+2));
        }
        try{
            int number= 50/0;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("rest of the code");

    }
}