import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ShoppingCartTest {
    ShoppingCart shoppingCart;

    @BeforeAll
    void setUp() {
        Item firstItem = new Item("Camisa", 200f, 2);
        Item secondItem = new Item("Tenis", 300f, 1);
        this.shoppingCart = new ShoppingCart();
        this.shoppingCart.addItem(firstItem);
        this.shoppingCart.addItem(secondItem);
    }

    @Test
    void shouldRealizeCreditCardPayment() {
        String result = this.shoppingCart.payWithCreditCard("Teste", "1234 5678 9123 4567", "123", new Date());
        assertEquals("Credit card payment realized", result);
    }

    @Test
    void shouldRealizePayPalPayment() {
        String result = this.shoppingCart.payWithPayPal("teste@teste.com", "123456");
        assertEquals("Paypal payment realized", result);
    }

    @Test
    void shouldRealizePixPayment() {
        String result = this.shoppingCart.payWithPix(KeyType.EMAIL, "teste@email.com");
        assertEquals("Pix payment realized", result);
    }

    @Test
    void shouldRealizeBoletoPayment() {
        String result = this.shoppingCart.payWithBoleto("34191.79001 01043.510047 91020.150008 7 93230026000");
        assertEquals("Boleto payment realized", result);
    }
}
