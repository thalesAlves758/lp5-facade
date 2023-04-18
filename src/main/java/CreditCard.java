import java.util.Date;

public class CreditCard implements Payment {
    private String cardholderName;
    private String number;
    private String cvc;
    private Date expiringDate;

    public CreditCard(String cardholderName, String number, String cvc, Date expiringDate) {
        this.cardholderName = cardholderName;
        this.number = number;
        this.cvc = cvc;
        this.expiringDate = expiringDate;
    }

    public boolean pay(float value) {
        return true;
    }
}
