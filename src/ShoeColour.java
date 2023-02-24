import java.util.Scanner;

public class ShoeColour {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the shoe colour you require");
        String shoeColour = reader.nextLine();

        if (shoeColour == "black" || shoeColour == "brown") {
            System.out.println("We have " + shoeColour + " in stock");
        }
        else{
            System.out.println("We don't have " + shoeColour + " in stock");
        }
    }
}