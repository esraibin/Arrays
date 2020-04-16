package Collections.Today;

public class ExtraChar {
    public static void main(String[] args) {
        String str= "aA - 1234567890 dsdas";
        System.out.println("char\t digit\tupper\tlower\tchar Value");
        for(int i=0; i<str.length() ; i++){
            System.out.print(str.charAt(i)+"\t\t");
            System.out.print(Character.isDigit(str.charAt(i))+"\t");
            System.out.print(Character.isUpperCase(str.charAt(i))+"\t");
            System.out.print(Character.isLowerCase(str.charAt(i))+"\t");
            System.out.print((int)str.charAt(i)-48);
            System.out.println();
        }

    }
}
