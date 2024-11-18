// Demonstrate basic mathematical operations in Java using Math class.

public class Main {
    public static void main(String[] args) {
        int a = 5, b = 15, c = 25, d = -35;
        
        // Print the values of a and b
        System.out.print("The two numbers 'a' and 'b' are: ");
        System.out.print(a + "," + " ");
        System.out.println(b);  // Output: 5, 15
        
        // Find and print the maximum number between a and b
        System.out.print("The maximum number is: ");
        System.out.println(Math.max(a, b));  // Output: 15
        
        // Find and print the minimum number between a and b
        System.out.print("The minimum number is: ");
        System.out.println(Math.min(a, b));  // Output: 5
        
        // Calculate and print the square root of c
        System.out.print("The Square root of c is: ");
        System.out.println(Math.sqrt(c));  // Output: 5.0 (since sqrt(25) = 5)
        
        // Calculate and print the absolute value of d
        System.out.print("The absolute positive value of d is: ");
        System.out.println(Math.abs(d));  // Output: 35
        
        // Print the negative value of b
        System.out.print("The negative value of b is: ");
        System.out.println((int) -b);  // Output: -15
    }
}
