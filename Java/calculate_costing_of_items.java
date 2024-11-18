// Calculate the total cost of items based on quantity and cost per item.

public class Main {
    public static void main(String[] args) {
        // Declare and initialize variables for item count, cost per item, and currency
        int items = 50;             // Number of items
        float costPerItem = 9.99f;  // Cost per single item
        float totalCost = items * costPerItem; // Total cost calculation
        char currency = '$';        // Currency symbol (dollar)

        // Display the results with relevant labels and formatting
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);
    }
}
