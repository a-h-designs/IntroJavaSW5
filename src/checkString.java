public class checkString {
    public static void main(String[] args) {
        System.out.println("Is the string equals to 'milk'?");
        String text = "water";

        if (!(text.equalsIgnoreCase("milk"))) {
            System.out.println("The word " + text + " does not contain milk");
        }
        else{
            System.out.println("The word " + text + " does contain milk");
        }
    }
}
