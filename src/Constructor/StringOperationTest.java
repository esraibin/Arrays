package Constructor;

public class StringOperationTest {
    public static void main(String[] args) {


        StringOperation myStr = new StringOperation("Java is super fun");
        System.out.println(myStr.returnReversed());
        System.out.println(myStr.returnCapitalized());

    }
}