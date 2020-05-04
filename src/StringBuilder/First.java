package StringBuilder;

public class First {
    public static void main(String[] args) {
        StringBuilder myBuilder = new StringBuilder();
        myBuilder.append("Java");
        myBuilder.append(" is");
        myBuilder.append(" fun");
        System.out.println(myBuilder);
        myBuilder.insert(7," super");// offset is index number
        System.out.println(myBuilder);
        myBuilder.replace(14,17,"strong");
        System.out.println(myBuilder);
        myBuilder.delete(0,4);
        System.out.println(myBuilder);
    }
}
