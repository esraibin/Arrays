package Constructor.March16;

public class Cipher {
    private String input;
    private int shift;
    public Cipher(){
        this.input="Java";
        this.shift=1;
    }

    public  Cipher(String input,int shift){
    this.input=input;
    this.shift=shift;

    }
    public void setInput(String newText){
        this.input= newText;
    }
    public String getInput(){
        return this.input;

    }
    public int getShift(){
        return this.shift;
    }

    public String cipherInput(){
        String result="";
        char letter;
        for (int i = 0; i <this.input.length() ; i++) {
            letter=this.input.charAt(i);
            letter += this.shift;
            result += letter;


        }this.input= result;
        return input;
    }
    public String DecipherInput(){
        String result= "";
        char letter;

        for (int i = 0; i <this.input.length() ; i++) {
            letter = this.input.charAt(i);
            letter -= this.shift;
            result += letter;

        }this.input =result;
        return this.input;
    }
    }