public class Main {
    public static void main(String[] args) {
        CreditPaymentService annuityPayment = new CreditPaymentService();
        int annuity12Month = (int) annuityPayment.calculate(1_000_000, 12, 9.99);
        int annuity24Month = (int) annuityPayment.calculate(1_000_000, 24, 9.99);
        int annuity36Month = (int) annuityPayment.calculate(1_000_000, 36, 9.99);

        System.out.println("Ежемесячный платёж (кредит на 1 год): " + annuity12Month + " ₽");
        System.out.println("Ежемесячный платёж (кредит на 2 года): " + annuity24Month + " ₽");
        System.out.println("Ежемесячный платёж (кредит на 3 года): " + annuity36Month + " ₽");
    }
}