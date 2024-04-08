import java.util.Scanner;

public class Main2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a two-digit number: ");
	        int number = scanner.nextInt();
	        
	        // Check if the number is a two-digit number
	        if (number >= 10 && number <= 99) {
	            int difference;
	            
	            if (number > 50) {
	                // If the number is greater than fifty, find the difference between the digits
	                int digit1 = number / 10;
	                int digit2 = number % 10;
	                difference =(digit1 - digit2);
	            } else {
	                // If the number is less than or equal to fifty, reverse the number and find the difference
	               
				    int reversedNumber = (number % 10) * 10 + (number / 10);
	                int digit1 = reversedNumber / 10;
	                int digit2 = reversedNumber % 10;
	                difference = (digit1 - digit2);
	            }
	            
	            System.out.println("Difference between digits: " + difference);
	        } else {
	            System.out.println("Invalid number");
	        }
	        
	        scanner.close();
	    }
	}