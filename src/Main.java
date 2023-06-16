import ftc.Motor;
import ftc.Sleep;

public class Main {
    public static void main(String[] args) {
        Motor L = new Motor(1);
        Motor R = new Motor(2);
        L.setPower(0.5);
        R.setPower(0.5);
        Sleep.forMilliseconds(3000);
        L.setPower(0);
        R.setPower(0);
    }
}