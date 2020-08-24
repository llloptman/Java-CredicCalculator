public class CreditPaymentService {
    public int calculate (int sum, int period){
        double rate = 9.99;
        double mRate = rate /12 /100;
        double a = mRate * Math.pow((1+mRate),period);
        double b = Math.pow((1 + mRate),(period))-1;
        double k = a/b;
        double mPayment = k * sum;
        return (int) mPayment;
    }
}
