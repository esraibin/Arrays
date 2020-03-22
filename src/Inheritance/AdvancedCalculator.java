package Inheritance;

public class AdvancedCalculator extends Calculator {
    String screenColor;

    public AdvancedCalculator(){
        super();
        this.screenColor="blue";

    }
    public int calAverage(int number1,int number2 ){
        return (number1+number2)/2;

    }
    public int calFactorial(int number){
        int result=1;
        for (int i = number; i >0 ; i--) {
            result *= i;

        } return result;
    }
    public double findSquareRoot(int number){
       return Math.sqrt(number);

    }
    public double findPower(int number){
        return number*number;

    }
}
