package MethodOverloading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java is fun(from main");
       // test.main("it is fun");

    }

    public static void main(String arg1) {
        System.out.println("Yes"+arg1);
       // Test.main("it is fun","indeed");
    }
    public static void main(String arg1, String args2){
        System.out.println("Right,"+ arg1+","+args2);
    }
}
