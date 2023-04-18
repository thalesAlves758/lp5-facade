public class Pix implements Payment {
    private KeyType keyType;
    private String key;

    public Pix(KeyType keyType, String key) {
        this.keyType = keyType;
        this.key = key;
    }

    public boolean pay(float value) {
        return true;
    }
}
