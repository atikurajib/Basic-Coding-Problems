// Taking 2 integer numbers as input and then add, subtract, multiply and divide them. Finally print the output results.

#include<stdio.h> // Include standard input/output library

int main()
{
    int num1, num2, add, sub, multi, div; // Declare variables for two numbers and results of operations

    // Get user input for the first and second integers
    printf("Enter the first integer: ");
    scanf("%d", &num1);
    printf("Enter the second integer: ");
    scanf("%d", &num2);

    // Perform addition and print the result
    add = num1 + num2;
    printf("\nAdd: %d\n", add);

    // Perform subtraction and print the result
    sub = num1 - num2;
    printf("Subtract: %d\n", sub);

    // Perform multiplication and print the result
    multi = num1 * num2;
    printf("Multiply: %d\n", multi);

    // Perform integer division and print the result
    div = num1 / num2;
    printf("Divide: %d\n", div);

    return 0; // Indicate successful executio
}
