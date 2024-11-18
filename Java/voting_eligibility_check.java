// Voting eligibility check based on age.

public class Main {
    public static void main(String[] args) {
        int myAge = 15;       // Define the age of the person
        int votingAge = 18;   // Define the legal voting age
        
        // Check if the person is eligible to vote
        if (myAge >= votingAge) {
            // If the person is old enough to vote
            System.out.println("Able to voting...");
        } else {
            // If the person is not old enough to vote
            System.out.println("Unable to voting...");
        }
    }
}
