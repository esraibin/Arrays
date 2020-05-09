package Methods;

public class RemoveConsecutive {
    public static void removeConsecutive(String text){
        String removed = "";
        for (int i = 0; i < text.length()-1 ; i++) {
            if(text.charAt(i) != text.charAt(i+1)){
                System.out.println(text.charAt(i));
            }
            else{
            }
        }
        return ;
    }
}
