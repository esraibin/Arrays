package MethodOverloading;

public class FirstOverloading {
    public static void main(String[] args) {
        printString();
        printString("Java");
        printString("Java",20);
    }
    public static void printString(){
        for (int i = 0; i <100 ; i++) {
            System.out.println("Hello World");
        }
    }
    public static void printString(String string){
        for (int i = 0; i < 100; i++) {
        System.out.println(string);
    }
    }
    public static void printString(String text,int times){
        for (int i = 0; i <times ; i++) {
            System.out.println(text);

        }
    }

}
