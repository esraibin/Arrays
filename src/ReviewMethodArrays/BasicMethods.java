package ReviewMethodArrays;

public class BasicMethods {
    public static void main(String[] args) {
        addInts(2,4);
        System.out.println(addDoubles(2,4));
        addChar('a','c');
        addString("esra","sema");
    }
    public static void addInts(int num1,int num2){
        System.out.println(num1+num2);
    }
    public static double addDoubles(double num1,double num2){
        return num1+num2;
    }
    public static void  addChar(char char1,char char2){
        System.out.println(char1+char2);
    }
    public static void addString(String string1,String string2){
        System.out.println(string1+string2);

    }

}
