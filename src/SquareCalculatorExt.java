//Workbook 1, but now read the width and height from the user
import java.util.Scanner;

public class SquareCalculatorExt {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("--SQUARE CALCULATOR EXT PROGRAM--");

        System.out.println("Enter the width = ");
        double width = reader.nextDouble();

        System.out.println("Enter the height = ");
        double height = reader.nextDouble();

        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        // 3. Create variable perimeter, calculate using formula 2 * w * h
        double perimeter = 2 * (width + height);
        // 4. Print variable perimeter
        System.out.println("Perimeter = " + perimeter);
        // 5. Create variable area, calculate using formula w * h
        double area = width * height;
        // 6. Print variable area
        System.out.println("Area = " + area);
    }
}