package StringBuilder;

public class LowerToUpper {//make lowerCase letters to UpperCase
    public static void main(String[] args) {
    StringBuilder builder = new StringBuilder("java");
    int letter;
    for(int i= 0; i<builder.length(); i++){
        letter = builder.codePointAt(i);// gets lowercase letter unicode number
        letter -= 32; //subtract 32 to find  uppercase unicode value
        builder.setCharAt(i,(char)letter);
    }
        System.out.println(builder);
    }

}
