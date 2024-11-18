// Demonstrating Widening and Narrowing Casting in Java.

// Widening Casting (Implicit Casting): Converting a smaller type to a larger type automatically
public class Main {
    public static void main(String[] args) {
        int x = 11;             // Integer value
        double y = x;           // Widening casting: int to double (automatic)
        System.out.println("Integer x: " + x);  // Prints integer value
        System.out.println("Double y: " + y);   // Prints double value (automatic casting result)
    }
}

// Narrowing Casting (Explicit Casting): Converting a larger type to a smaller type manually
public class Main {
    public static void main(String[] args) {
        double x = 11.11d;      // Double value
        int y = (int) x;        // Narrowing casting: double to int (manual casting)
        System.out.println("Double x: " + x);   // Prints double value
        System.out.println("Integer y: " + y);  // Prints int value (after truncation of decimal part)
    }
}
