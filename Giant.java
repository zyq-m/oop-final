/**
 * Bicycle
 * QUESTION 4
 */
public class Giant extends Bicycle {
    private String model;

    public Giant(int speed, double price, String color, String model) {
        super(speed, price, color);
        this.model = model;
    }

    public double getPrice() {
        double price = super.price;

        // that price is greater or equal to RM4000, 15% more discounts will be given
        if (price >= 4000) {
            return price * 0.85;
        }
        return price;
    }

    public String getModel() {
        return model;
    }
}
