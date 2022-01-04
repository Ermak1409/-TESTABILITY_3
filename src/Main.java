public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int payment = (int) service.calculate(1_000_000, 1, 9.99);
        System.out.println("Ежемесячный платеж = " + payment);

        int payment2 = (int) service.calculate(1_000_000, 2, 9.99);
        System.out.println("Ежемесячный платеж = " + payment2);

        int payment3 = (int) service.calculate(1_000_000, 3, 9.99);
        System.out.println("Ежемесячный платеж = " + payment3);

    }
}

