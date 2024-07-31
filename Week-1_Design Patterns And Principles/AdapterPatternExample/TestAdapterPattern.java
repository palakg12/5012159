package AdapterPatternExample;

public class TestAdapterPattern {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPal());
        paypalProcessor.processPayment(100.00);

        PaymentProcessor stripeProcessor = new StripeAdapter(new Stripe());
        stripeProcessor.processPayment(150.00);

        PaymentProcessor squareProcessor = new SquareAdapter(new Square());
        squareProcessor.processPayment(200.00);
    }
}
