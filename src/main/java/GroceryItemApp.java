import java.util.Scanner;

public class GroceryItemApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GroceryItem grapes = new GroceryItem("Grapes","Produce",5,false);

        System.out.println("Welcome to GrocerTracker");
        System.out.println("Press 1 to see the details of your item");
        System.out.println("Press 2 to activate a sale on your item");

    }
}
