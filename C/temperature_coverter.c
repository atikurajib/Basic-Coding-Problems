// Temperature of a city in Fahrenheit degrees is input through the keyboard. Write a program to convert this temperature into Centigrade degrees.fahrenheit=(celcius*9/5)+32

#include<stdio.h> // Include standard input/output library

int main()
{
    float fahrenheit, celsius; // Declare variables for Fahrenheit and Celsius

    // Input temperature in Fahrenheit
    printf("Enter temperature in Fahrenheit: ");
    scanf("%f", &fahrenheit);

    // Convert Fahrenheit to Celsius
    celsius = (fahrenheit - 32) * 5 / 9;

    // Output temperature in Celsius
    printf("\nTemperature in Celsius: %.2f\n", celsius);

    return 0; // Indicate successful program execution
}
