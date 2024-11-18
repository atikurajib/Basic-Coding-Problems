// Taking 3 float numbers and calculating the average of them.

#include<stdio.h> // Include standard input/output library

int main()
{
    float num1, num2, num3, sum, average; // Variables for numbers, their sum, and average

    // Input three floating-point numbers from the user
    printf("Enter the first float number: ");
    scanf("%f", &num1);
    printf("Enter the second float number: ");
    scanf("%f", &num2);
    printf("Enter the third float number: ");
    scanf("%f", &num3);

    // Calculate the sum and average
    sum = num1 + num2 + num3;
    average = sum / 3;

    // Display the average, formatted to 2 decimal places
    printf("\nThe average of these three floating numbers: %.2f\n", average);

    return 0; // Indicate successful execution
}
