import java.util.Scanner;

//Workbook 1
public class SquareCalculator {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("--SQUARE CALCULATOR PROGRAM--");

        System.out.println("Enter Width : ");
        double width = reader.nextDouble(); //13.5
        System.out.println("Enter Height : ");
        double height = reader.nextDouble(); //25.3

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