public class CreditPaymentService {
    public double calculate(int credit, int year, double percent) {
        int mounth = year * 12;
        double mounthPercent = percent / 100 / 12;
        double coef = mounthPercent + (mounthPercent / (Math.pow(1+mounthPercent, mounth)-1));
        return (coef * credit);

    }
}
