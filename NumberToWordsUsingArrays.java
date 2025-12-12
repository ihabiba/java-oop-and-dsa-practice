import java.util.Scanner;

public class ThirdQuestion {

    // Arrays to store the words for numbers
    private static final String[] ones = {
        "", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE",
        "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"
    };

    private static final String[] tens = {
        "", "", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"
    };

    public static void main(String[] args) { // Start of main method
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number : ");
        
        // Read the input number as a double
        double inputNumber = scanner.nextDouble();

        // Separate the input number into ringgit (whole number part) and cents (fractional part)
        long ringgit = (long) inputNumber;  // Cast to long to get the integer part
        long cents = Math.round((inputNumber - ringgit) * 100);  // Subtract the integer part, multiply by 100, and round to get the cents

        // Convert the ringgit and cents to words and print the result
		  String ringgitInWords = convert(ringgit);
		  String centsInWords = convertCents(cents);
        if (cents == 0) {
          System.out.println("RINGGIT MALAYSIA : " + ringgitInWords);
       } else {
           System.out.println("RINGGIT MALAYSIA : " + ringgitInWords + " AND " + centsInWords);
          }
    } //main

    // Method to convert a number into words (handles ringgit part)
    public static String convert(long number) { // Start of convert method
        // If the number is zero, return "ZERO"
        if (number == 0) {
            return "ZERO";
        }

        String result = "";  // Initialize an empty string to build the result

        // Check for millions
        if (number / 1000000 > 0) {
            result += convert(number / 1000000) + " MILLION ";  // Recursively convert the millions part
            number %= 1000000;  // Update the number to the remainder
        } 

        // Check for thousands
        if (number / 1000 > 0) {
            result += convert(number / 1000) + " THOUSAND ";  // Recursively convert the thousands part
            number %= 1000;  // Update the number to the remainder
        } 

        // Check for hundreds
        if (number / 100 > 0) {
            result += convert(number / 100) + " HUNDRED ";  // Recursively convert the hundreds part
            number %= 100;  // Update the number to the remainder
        } 

        // Check for numbers less than 100
        if (number > 0) {
            if (number < 20) {
                // Numbers from 1 to 19
                result += ones[(int) number];  // Use the ones array
            } else {
                // Numbers from 20 to 99
                result += tens[(int) number / 10];  // Use the tens array
                if (number % 10 > 0) {
                    result += " " + ones[(int) number % 10];  // Add the ones part if any
                }
            } 
        } 
        // Trim any extra spaces and return the result
        return result.trim();
    } //convert method

    // Method to convert cents into words
    public static String convertCents(long number) { // Start of convertCents method
        // If the number is zero, return "ZERO CENTS"
        if (number == 0) {
            return "ZERO CENTS";
        }
        // Convert the number to words and add "CENTS"
        return convert(number) + " CENTS";
    } //convertCents method

} //class
