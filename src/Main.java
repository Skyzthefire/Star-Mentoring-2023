import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final float TRACK_WIDTH_MIN = 4;
        final float TRACK_WIDTH_MAX = 12;
        final float VELOCITY_MIN = -100;
        final float VELOCITY_MAX = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the track width of the robot");
        System.out.print("between " + TRACK_WIDTH_MIN + "and" + TRACK_WIDTH_MAX + "inches: ");
        float trackWidth = 0;

        while (true) {
            String input = scanner.nextLine().trim();
            try {
                trackWidth = Float.parseFloat(input);
            } catch (NumberFormatException ignored) {
                System.out.println("Input was not a valid floating point number");
                 System.out.println("Please reenter the input: ");
                 continue;
            }

            if (trackWidth > TRACK_WIDTH_MAX || trackWidth < TRACK_WIDTH_MIN) {
                System.out.println("Track width was not between " +
                TRACK_WIDTH_MIN + "and" + TRACK_WIDTH_MAX + "inches");
                continue; 
            }
            break;
        }

        System.out.print("Please enter the velocity of the Front Left Wheel (Inches per second): ");
        float frontLeftVelocity = scanner.nextFloat();

        System.out.print("Please enter the velocity of the Front Right Wheel (Inches per second): ");
        float frontRightVelocity = scanner.nextFloat();

        System.out.print("Please enter the velocity of the Back Left Wheel (Inches per second): ");
        float backLeftVelocity = scanner.nextFloat();

        System.out.print("Please enter the velocity of the Back Right Wheel (Inches per second): ");
        float backRightVelocity = scanner.nextFloat();
    }


}