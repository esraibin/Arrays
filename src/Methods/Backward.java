package Methods;

public class Backward {
    public static void BackwardString(){

           String newText= "I love Java, Madly";

            for (int i = newText.length()-1; i >= 0 ; i--) {
                System.out.print(newText.charAt(i));
            }
        }
        public static String reverseText(String text){

        String result= "";

            for (int i = text.length()-1; i >= 0; i--) {
                result= result+text.charAt(i);
            }
            return result;
        }
    }
