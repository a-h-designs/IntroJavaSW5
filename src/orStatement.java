public class orStatement {
    public static void main(String[] args) {
        String order = "Pizza";

        if (order == "Pizza" || order == "Spaghetti") {
            System.out.println("Order granted, cooking now...");
        }
        else{
            System.out.println("We only sell Pizza or Spaghetti");
        }
    }
}
