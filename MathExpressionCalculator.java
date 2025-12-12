import java.util.Scanner;

public class firstQuestion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Ask the user to enter the values
        System.out.println("Enter the value of b:");
        double b = input.nextDouble();
		  
		  System.out.println("Enter the value of c:");
        double c = input.nextDouble();
		  
		  System.out.println("Enter the value of d:");
        double d = input.nextDouble();

        // Step 2: Compute and display the value of a and e
        double a = calculateA(b, c, d);
        double e = calculateE(a, b, c, d);
        System.out.printf("a value: %.2f\n", a);
        System.out.printf("e value: %.2f\n", e);

        // Step 3: Find the maximum and minimum value between a and e
        double max = Math.max(a, e);
        double min = Math.min(a, e);
        System.out.printf("Maximum value between a and e: %.2f\n", max);
        System.out.printf("Minimum value between a and e: %.2f\n", min);
    }//main

    // Step 4: Method to calculate a
    public static double calculateA(double b, double c, double d) {
        double a = Math.sqrt(Math.pow(b, 4) * Math.pow(c, 3)) + (b % 2 * d);
        return a;
    }//calculateA

    // Step 4: Method to calculate e
    public static double calculateE(double a, double b, double c, double d) {
        double e = Math.sqrt(a * b * c * d - 10);
        return e;
    }//calculateE
}//class