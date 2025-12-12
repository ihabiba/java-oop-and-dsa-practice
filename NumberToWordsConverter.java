import java.util.Scanner;

public class NumberToWordsConverter {

    // Arrays to store the words for numbers
    private static final String[] UNITS = {
        "", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", 
        "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"
    };

    private static final String[] TENS = {
        "", "", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object for input
        System.out.print("Enter your number: ");
        
        double inputNumber = scanner.nextDouble();  // Read input number
        long ringgit = (long) inputNumber;  // Separate integer part for ringgit
        long cents = Math.round((inputNumber - ringgit) * 100);  // Separate fractional part for cents
        
        String ringgitInWords = convertToWords(ringgit);  // Convert ringgit to words
        String centsInWords = convertToWords(cents) + " CENTS";  // Convert cents to words

        // Print the result
        if (cents == 0) {
            System.out.println("RINGGIT MALAYSIA: " + ringgitInWords);
        } else {
            System.out.println("RINGGIT MALAYSIA: " + ringgitInWords + " AND " + centsInWords);
        }
    }

    // Method to convert a number into words
    public static String convertToWords(long number) {
        if (number == 0) {
            return "ZERO";  // Return ZERO if the number is 0
        }

        String result = "";  // Initialize result string

        if (number / 1000000 > 0) {
            result += convertToWords(number / 1000000) + " MILLION ";  // Convert millions part
            number %= 1000000;  // Update number
        }
        if (number / 1000 > 0) {
            result += convertToWords(number / 1000) + " THOUSAND ";  // Convert thousands part
            number %= 1000;  // Update number
        }
        if (number / 100 > 0) {
            result += convertToWords(number / 100) + " HUNDRED ";  // Convert hundreds part
            number %= 100;  // Update number
        }
        if (number > 0) {
            if (number < 20) {
                result += UNITS[(int) number];  // Convert numbers less than 20
            } else {
                result += TENS[(int) number / 10];  // Convert tens part
                if (number % 10 > 0) {
                    result += " " + UNITS[(int) number % 10];  // Convert units part if any
                }
            }
        }
        return result.trim();  // Return the result string trimmed of any extra spaces
    }
}