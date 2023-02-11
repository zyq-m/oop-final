public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        Fan fan3 = new Fan();

        fan1.setSpeed(1);
        fan1.setColor("Black");
        fan1.setOn(true);

        fan2.setSpeed(2);
        fan2.setColor("Yellow");
        fan2.setOn(true);

        fan3.setSpeed(0);
        fan3.setOn(false);

        fan1.toString();
        fan2.toString();
        fan3.toString();
    }
}
