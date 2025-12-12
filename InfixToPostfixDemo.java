// Main class to test the implementation
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InfixToPostfixDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    
		  // Create an object of ExpressionConverter
		  ExpressionConverter converter = new ExpressionConverter();
		  // Create an object of ExpressionEvaluator
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
                
        System.out.print("Enter an infix expression: ");
        String infix = scanner.nextLine();

        try {
            
            // Convert infix to postfix using the object
            String postfix = converter.infixToPostfix(infix);
            System.out.println("Postfix: " + postfix);

            // Ask the user if they want to evaluate the postfix
            System.out.print("Do you want to evaluate the postfix expression? (yes/no): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                // Collect values for letter operands if any
                Map<Character, Integer> values = new HashMap<>();
                for (char c : postfix.toCharArray()) {
                    if (Character.isLetter(c) && !values.containsKey(c)) {
                        System.out.print("Enter the value for " + c + ": ");
                        values.put(c, scanner.nextInt());
                    }
                }

               // Evaluate the postfix expression using the object
                int result = evaluator.evaluatePostfix(postfix, values);
                System.out.println("Result: " + result);
            } else {
                System.out.println("Evaluation skipped.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
