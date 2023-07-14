import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Please enter a number: ");
    int num = in.nextInt();
    
    if (num % 3 == 0) {
        if (num % 5 == 0) {
            System.out.println("fizzbuzz");
        }
        System.out.println("fizz");
    }
        
    else if (num % 5 == 0)
    System.out.println("buzz");
    
    else
     System.out.println(num);
}
}