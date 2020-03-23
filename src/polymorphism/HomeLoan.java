package polymorphism;

public class HomeLoan extends Loan{
    double PMI;

    public HomeLoan(int accountNumber, String accountName,double balance,
                    double interestRate, int numberOfPayment, double loanAmount, double PMI){
        super(accountNumber,accountName,balance,interestRate,numberOfPayment,loanAmount);
    this.PMI= PMI;
    }
    public void monthlyPayment(){
        double result= super.loanAmount*super.interestRate/super.numberOfPayment+this.PMI;
        System.out.println("montly payment"+result);
    }
    public void totalPayment(){
        double result= super.loanAmount*super.interestRate+this.PMI*super.numberOfPayment;
    }
}
