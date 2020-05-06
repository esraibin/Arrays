package Methods;

public class ASCIINumber {
    public static void main(String[] args) {
     printWholeNumber();
        printUpperCase();
        printLowerCase();
        printASCII();
    }
    public static void printWholeNumber(){
        for (int i = 100; i < 1000 ; i++) {
            System.out.println(i);
        }

    }
    public static void printASCII(){
        for (int i = 0; i < 256 ; i++) {
            System.out.println((char)i);
        }
    }
    public static void printLowerCase(){
        for (int i = 97; i < 123 ; i++) {
            System.out.println((char)i);
        }
    }
    public static void printUpperCase(){

        for (int i = 65; i < 91; i++) {
        System.out.println((char)i);
        }
    }
}
