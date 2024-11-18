// The length & breadth of a rectangle are input through the keyboard. Find out the rectangle’s area.

#include<stdio.h> // Include standard input/output library

int main()
{
    int length, breadth, area; // Declare variables for length, breadth, and area

    // Prompt the user to input the length of the rectangle
    printf("Enter the length of the rectangle: ");
    scanf("%d", &length);

    // Prompt the user to input the breadth of the rectangle
    printf("Enter the breadth of the rectangle: ");
    scanf("%d", &breadth);

    // Calculate the area of the rectangle
    area = length * breadth;

    // Display the calculated area
    printf("\nArea of the Rectangle is %d\n", area);

    return 0; // Indicate successful program execution
}
