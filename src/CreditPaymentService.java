public class CreditPaymentService {
    public double calculate(int loanAmount, int loanTerm, double loanRate) {
        double monthLoanRate = loanRate / 100 / 12;
        return (loanAmount * monthLoanRate) / (1 - (1 / Math.pow(monthLoanRate + 1, loanTerm)));
    }
}
