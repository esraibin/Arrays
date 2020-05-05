package StringBuilder;

public class Third {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Samantha");
        System.out.println(str);
        str.setCharAt(0,'E');
        System.out.println(str);
        System.out.println(str.codePointCount(0,5));// returns total number of character at given index
        System.out.println(str.codePointAt(3)); // return unicode value(includes ASCII and all other language's char
    }
}
