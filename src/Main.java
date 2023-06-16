import ftc.Motor;
import ftc.Sleep;

public class Main {
    public static void main(String[] args) {
        Motor left = new Motor(1);
        Motor right = new Motor(2);
        left.setPower(0.5);
        right.setPower(0.5);
        Sleep.forMilliseconds(3000);
        left.setPower(0);
        right.setPower(0);
    }
}