package ReviewMethodArrays;

public class SpaceRemoving {
    ///check it
    public static void main(String[] args) {

        replaceSpacesVoid("Today we are Java Warrior");
    }
    public static void replaceSpacesVoid(String sentence){
        for (int i = 0; i <sentence.length() ; i++) {
            if(sentence.charAt(i) !=' '){
                System.out.print(sentence.charAt(i));
            }
            else {
                System.out.print("-");
            }

        }
    }

        }