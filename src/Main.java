public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Ежемесячный платеж (срок кредита 1 год) равен " + service.calculate(1000000, 9.99, 12) + " рублей(-я)");

        System.out.println("Ежемесячный платеж (срок кредита 2 года) равен " + service.calculate(1000000, 9.99, 24) + " рублей(-я)");

        System.out.println("Ежемесячный платеж (срок кредита 3 года) равен " + service.calculate(1000000, 9.99, 36) + " рублей(-я)");
    }
}