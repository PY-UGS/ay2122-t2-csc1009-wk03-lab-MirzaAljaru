import java.util.Date;



public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;
    
    

    public Loan() {
    }

    

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }


    public double getLoanAmount() {
        return loanAmount;
    }
    
    public Date getLoanDate() {
        return loanDate;
    }



    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment(){
        double loanAmount = this.getLoanAmount();
        double monthlyInterestRate = this.getAnnualInterestRate() / 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate ) / (1- 1/ Math.pow(1 + monthlyInterestRate,this.getNumberOfYears() * 12));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment = this.getMonthlyPayment() * this.getNumberOfYears() * 12;
        return totalPayment;

    }


    
}
