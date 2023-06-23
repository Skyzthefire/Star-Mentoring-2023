import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the track width of the robot (inches): ");
        float trackWidth = scanner.nextFloat();
       
        System.out.print("Please enter the velocity of the Front Left Wheel (Inches per second): ");
        float frontLeftVelocity = scanner.nextFloat();
        System.out.print("Please enter the velocity of the Front Right Wheel (Inches per second): ");
        
        float frontRightVelocity = scanner.nextFloat();
       
        System.out.print("Please enter the velocity of the Back Left Wheel (Inches per second): ");
        float backLeftVelocity = scanner.nextFloat();
        
        System.out.print("Please enter the velocity of the Back Right Wheel (Inches per second): ");
        float backRightVelocity = scanner.nextFloat();

        float angularVelocityRadians = (backRightVelocity + frontRightVelocity - frontLeftVelocity - backLeftVelocity) /
                                        (4 * trackWidth);
        float angularVelocityDegrees = (float) Math.toDegrees(angularVelocityRadians);

        System.out.println("The angular velocity is " + angularVelocityDegrees + "degrees per second");

        scanner.close();
    }
}