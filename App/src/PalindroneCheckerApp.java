import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
class PalindroneCheckerApp{


    /**
     * Application entry point for UC6.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define the input string to validate
        String input = "civic";

        // Create a Queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);      // FIFO
            stack.push(c);     // LIFO
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();  // front of queue
            char fromStack = stack.pop();     // top of stack

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}





