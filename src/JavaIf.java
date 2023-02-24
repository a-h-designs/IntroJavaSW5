import java.util.Scanner;

public class JavaIf {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your age...");
        int age = reader.nextInt();
        if (age >= 0 && age < 18)
        {
            System.out.println("You are too young for this game");
        }
        else if (age >= 18)
        {
            System.out.println("Enter granted!");
        }
        else {
            System.out.println("You entered wrong number");
        }
    }
}