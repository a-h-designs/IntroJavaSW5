import java.util.Scanner;

public class gameContinue {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Do you want to continue the game? Yes or No.");
        String text = reader.nextLine();

        if (!(text.equalsIgnoreCase("yes"))) {
            System.out.println("The game has ended.");
            System.out.println("Goodbye.");
        }
        else{
            System.out.println("Continue to the next level.");
        }
    }
}