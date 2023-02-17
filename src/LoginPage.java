// this program will read user name (String) and password (int)

import java.util.Scanner; // import Scanner class

public class LoginPage {
    public static void main(String[] args) {
        // create Scanner object
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter you name : ");
        // read username
        String name = reader.nextLine();


        System.out.println("Enter your age : ");
        // read password
        int age = reader.nextInt();

        System.out.println("Enter you location : ");
        // read username
        String location = reader.nextLine();

        // print information
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your location is " + location);
    }
}