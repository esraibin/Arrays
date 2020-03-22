package Inheritance;

public class Calculator {
    public int displayValue;

    public Calculator(){
        this.displayValue=0;
    }
    protected int Add(int number1, int number2){
        return number1+number2;

    }
    public double Divide(int number1,int number2){
       displayValue= number1/number2;
       return displayValue;

    }
    private int Subtract(int number1,int number2){
        displayValue=number1-number2;
        return displayValue;
    }
    public int Multiply(int number1,int number2){
        displayValue= number1*number2;
        return displayValue;
    }
}
