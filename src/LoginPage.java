// this program will read name (String) and age (int) location (string)

import java.util.Scanner; // import Scanner class

public class LoginPage {
    public static void main(String[] args) {
        // create Scanner object
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter you name : ");
        // read name
        String name = reader.nextLine();

        System.out.println("Enter you location : ");
        // read location
        String location = reader.nextLine();

        System.out.println("Enter your age : ");
        // read age
        int age = reader.nextInt();

        // print information
        System.out.println("Your name is " + name);
        System.out.println("Your location is " + location);
        System.out.println("Your age is " + age);
    }
}