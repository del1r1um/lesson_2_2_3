public class CreditPaymentService {
    public int calculate(int loanAmount, int loanTerm, double loanRate) {
        double monthLoanRate = loanRate / 100 / 12;
        double annuityPayment = (loanAmount * monthLoanRate) / (1 - (1 / Math.pow(monthLoanRate + 1, loanTerm)));
        return (int) annuityPayment;
    }
}