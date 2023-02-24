import java.util.Scanner;

public class ProtectedMoneyCheckerExt {
    public static void main(String[] args) {
        // check if the number is between 0 to 85000
        System.out.println("Is the money in you bank account protected by the government?");
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your balance...");
        int number = reader.nextInt();

        if (!(number >=0 && number <= 85000)) {
            System.out.println("Sorry, your money is not protected");
        }
        else {
            System.out.println("Your money is protected");
        }
    }
}