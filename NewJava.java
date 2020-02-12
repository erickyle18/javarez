import java.util.Scanner;


public class NewJava {

	public static void main(String[] args) {
		
		//Create a new scanner object
		Scanner input = new Scanner(System.in);
		
		//Initialize variables
		int number1;
		int number2;
		int sum;
		
		//Receive user input
		System.out.println("Enter the first integer: ");
		number1 = input.nextInt(); //Read the first integer from the user
		
		System.out.println("Enter the second integer: ");
		number2 = input.nextInt(); //Read the second integer from the user
		
		//Calculate the value of sum
		sum = number1 + number2;
		
		//Display the value of sum
		System.out.printf("Sum is %d%n",sum);
		
		
	}

}
