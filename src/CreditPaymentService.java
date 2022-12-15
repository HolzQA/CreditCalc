import java.math.BigDecimal;
import java.math.RoundingMode;

public class CreditPaymentService {

    public double calculate(int s, double r, int n) {
        double pr = r / 1200;
        double result = (double) s * pr * Math.pow(pr + 1, n) / (Math.pow(pr + 1, n) - 1);
        return (int) result;
    }
}
