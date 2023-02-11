/**
 * Bicycle
 * QUESTION 4
 */
public class Bicycle {

    public int speed;
    public double price;
    public String color;

    public Bicycle(int speed, double price, String color) {
        this.speed = speed;
        this.price = price;
        this.color = color;
    }

    public double getPrice() {
        // the price will be given RM150 discount if the bicycle price is greater or
        // equal to RM1000
        if (price >= 1000) {
            return price - 150;
        }
        return price;
    }

    public String getColor() {
        return color;
    }
}