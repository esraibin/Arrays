package Constructor;

public class StringOperation {
    String value;
    public StringOperation(){
        this.value="";
    }
    public StringOperation(String value){
        this.value = value;

    }
    public String returnReversed(){
        String result = "";
        for (int i = this.value.length()-1; i >= 0 ; i--) {
            result += this.value.charAt(i);
        }
        return result;
    }
    public String returnCapitalized(){
        //first concat first letter and convert letter to  uppercase
        String result = "";
        result += this.value.charAt(0);
        result+= result.toUpperCase();
        String letter= "";
        for (int i = 1; i <this.value.length() ; i++) {
            if(this.value.charAt(i-1)==' '){
                //check previous char if it is space convert to String using concat and convert toUpperCase
                letter += this.value.charAt(i); //coverts string
                letter += letter.toUpperCase();//converting upper
                result+=letter;//concat result
                letter= "";// resets for the second word
            }
            else{
                result+= this.value.charAt(i);
            }

        }
        return result;
    }

    @Override
    public String toString() {
        return "StringOperation{" +
                "value='" + value + '\'' +
                '}';
    }
}
