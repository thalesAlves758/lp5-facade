public class PayPal implements Payment {
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public boolean pay(float value) {
        return true;
    }
}
