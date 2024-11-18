// Narrowing Casting (Explicit Casting): Converting a larger type to a smaller type manually.

public class Main {
    public static void main(String[] args) {
        double x = 11.11d;      // Double value
        int y = (int) x;        // Narrowing casting: double to int (manual casting)
        System.out.println("Double x: " + x);   // Prints double value
        System.out.println("Integer y: " + y);  // Prints int value (after truncation of decimal part)
    }
}
