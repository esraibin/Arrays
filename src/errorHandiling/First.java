package errorHandiling;

public class First {
    public static void main(String[] args) {
        int x=10;
        int y=0;
        try{
            System.out.println(x/y);
        }
        // e is an object of the exception, convention
        catch (Exception e){
            //this shows type of exception
            System.out.println(e);

        }
        System.out.println("can you see me?");

        String s= null;
        try{
        System.out.println(s.length());

        }
        catch (Exception e){
        System.out.println("Oops");
        }
        String a= "a";
        try{
        int number = Integer.parseInt(a);
        }
        catch(Exception e){
        System.out.println("Sorry, I could not convert it.");
        }
        int numbers[]={1,2,3,4,5};
        try{
        System.out.println(numbers[77]);
        }
        catch (Exception e){
        System.out.println("Sorry numbers does not have that index");
    }
 }
}
