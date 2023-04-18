import java.util.Date;

public class PaymentSystem {
    private static float calculateTotal(ShoppingCart shoppingCart) {
        int total = 0;

        for(Item item : shoppingCart.getItems()) {
            total += item.getValue() * item.getQuantity();
        }

        return total;
    }

    public static boolean payWithCreditCard(ShoppingCart shoppingCart, String cardholderName, String number, String cvc, Date expiringDate) {
        CreditCard creditCard = new CreditCard(cardholderName, number, cvc, expiringDate);
        return creditCard.pay(calculateTotal(shoppingCart));
    }

    public static boolean payWithPayPal(ShoppingCart shoppingCart, String email, String password) {
        PayPal payPal = new PayPal(email, password);
        return payPal.pay(calculateTotal(shoppingCart));
    }

    public static boolean payWithPix(ShoppingCart shoppingCart, KeyType keyType, String key) {
        Pix pix = new Pix(keyType, key);
        return pix.pay(calculateTotal(shoppingCart));
    }

    public static boolean payWithBoleto(ShoppingCart shoppingCart, String code) {
        BoletoPayment boletoPayment = new BoletoPayment(code);
        return boletoPayment.pay(calculateTotal(shoppingCart));
    }
}
