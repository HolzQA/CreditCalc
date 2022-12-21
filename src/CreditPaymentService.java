import java.math.BigDecimal;
import java.math.RoundingMode;

public class CreditPaymentService {

    public double calculate(int creditSum, double percent, int months) {
        double pr = percent / 1200;
        double result = (double) creditSum * pr * Math.pow(pr + 1, months) / (Math.pow(pr + 1, months) - 1);
        return (int) result;
    }
}
