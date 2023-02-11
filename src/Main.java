public class Main {
    public static void main(String[] args) {

        int numInput; // stores "user input"

        System.out.println("Enter an integer to see if it's odd or even."); // prompts user for number
        numInput = 11; // simulates input
        System.out.println("You entered: " + numInput); // clarifies test runs


        // if the number is divisible by 2, it's even:
        if (numInput % 2 == 0) {
            System.out.println(numInput + " is even.");  // tells user it's even
        } else {
            System.out.println(numInput + " is odd.");   // if not divisible by 2, tells user it's odd
        }

        // end

    }
}