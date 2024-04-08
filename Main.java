import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Array to store words for digits
        String[] units = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        // Array to store words for tens
        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        // Array to store words for teens
        String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        // Convert the number to words
        String words = "";
        if (number >= 100) {
            words += units[number / 100] + " Hundred ";
            number %= 100;
        }

        if (number >= 10 && number <= 19) {
            words += teens[number - 10];
        } else {
            words += tens[number / 10];
            if (number % 10 != 0) {
                words += " " + units[number % 10];
            }
        }

        System.out.println("Output: " + words);
    }
}