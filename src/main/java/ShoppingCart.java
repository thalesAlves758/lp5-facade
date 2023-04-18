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

    public boolean payWithCreditCard(String cardholderName, String number, String cvc, Date expiringDate) {
        return PaymentSystem.payWithCreditCard(this, cardholderName, number, cvc, expiringDate);
    }

    public boolean payWithPayPal(String email, String password) {
        return PaymentSystem.payWithPayPal(this, email, password);
    }

    public boolean payWithPix(KeyType keyType, String key) {
        return PaymentSystem.payWithPix(this, keyType, key);
    }

    public boolean payWithBoleto(String code) {
        return PaymentSystem.payWithBoleto(this, code);
    }
}
