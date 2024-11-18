//The length & breadth of a rectangle are input through the keyboard. Find out the rectangle’s area

#include<stdio.h>
int main()
{
    int length, breadth, area; // Declare variables
    // Get user input for length and breadth of the rectangle
    printf("Enter the length of rectangle: ");
    scanf("%d", &length);
    printf("Enter the breadth of rectangle: ");
    scanf("%d", &breadth);    
    // Calculate and display the area of the rectangle
    area = length * breadth;
    printf("\nArea of Rectangle is %d\n", area);    
    return 0; // Successful program execution
}
