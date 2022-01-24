import java.util.Scanner;

public class LoanCalculator {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate for example, 8.25: ");
        double annualInterestRate = input.nextDouble()/100;

        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);


        System.out.println("The loan was created on: " + loan.getLoanDate());
        System.out.printf("The monthly payment is: %.2f\n",loan.getMonthlyPayment());
        System.out.printf("The total payment is: %.2f\n",loan.getTotalPayment());


        input.close();
    }
}
