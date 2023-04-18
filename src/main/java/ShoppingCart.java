import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public List<Item> getItems() {
        return this.items;
    }

    public String payWithCreditCard(String cardholderName, String number, String cvc, Date expiringDate) {
        boolean result = PaymentSystem.payWithCreditCard(this, cardholderName, number, cvc, expiringDate);

        return result ? "Credit card payment realized" : "Could not realize credit card payment";
    }

    public String payWithPayPal(String email, String password) {
        boolean result = PaymentSystem.payWithPayPal(this, email, password);

        return result ? "Paypal payment realized" : "Could not realize Paypal payment";
    }

    public String payWithPix(KeyType keyType, String key) {
        boolean result = PaymentSystem.payWithPix(this, keyType, key);

        return result ? "Pix payment realized" : "Could not realize Pix payment";
    }

    public String payWithBoleto(String code) {
        boolean result = PaymentSystem.payWithBoleto(this, code);

        return result ? "Boleto payment realized" : "Could not realize Boleto payment";
    }
}
