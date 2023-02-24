//Workbook 1
public class SquareCalculator {
    public static void main(String[] args) {

        System.out.println("--SQUARE CALCULATOR PROGRAM--");

        double width = 13.5;
        double height = 25.3;

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