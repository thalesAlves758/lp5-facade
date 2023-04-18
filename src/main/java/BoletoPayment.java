public class BoletoPayment implements Payment {
    private String code;

    public BoletoPayment(String code) {
        this.code = code;
    }

    public boolean pay(float value) {
        return true;
    }
}
