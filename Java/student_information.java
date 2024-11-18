// Display student information including name, age, ID, final marks, grade, phone number, and address.

public class Main {
    public static void main(String[] args) {
   
        // Initialize student information variables
        String studentName = "Ahmed";            // Student's name
        int studentAge = 11;                     // Student's age
        int studentID = 222113;                  // Student's ID number
        char studentGrade = 'A';                 // Student's grade
        float studentFinalMarks = 75.5f;         // Student's final marks (float type for decimal values)
        int studentPhoneNumber = 1747681997;     // Student's phone number (use appropriate data type for large numbers) 
        String studentAddress = "Mirpur";        // Student's address
        
        // Displaying the student's information
        System.out.println("Student Information-----");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("ID: " + studentID);
        System.out.println("Grade: " + studentGrade);
        System.out.println("Final Marks: " + studentFinalMarks);
        System.out.println("Phone Number: " + "+880" + studentPhoneNumber);  // Formatting phone number with country code
        System.out.println("Address: " + studentAddress);
    }
}
