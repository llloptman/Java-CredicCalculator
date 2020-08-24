public class Main {
    public static void main(String[] args) {
        CreditPaymentService credit = new CreditPaymentService();
        int test1 = credit.calculate(1000000,12);
        System.out.println(test1);

        int test2 = credit.calculate(1000000,24);
        System.out.println(test2);

        int test3 = credit.calculate(1000000,36);
        System.out.println(test3);
    }
}
