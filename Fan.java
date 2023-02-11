public class Fan {
    private int speed;
    private boolean on;
    private String color;

    public Fan() {
        speed = 0;
        on = false;
        color = "White";
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "Speed: " + speed + "\nColor: " + color;
        }
        return "Speed: " + speed + "\nColor: " + color + "\nThe Fan is off";
    }
}
