package day02;
import java.util.Scanner;
public class IfExample{
	
	protected static Scanner input;

public static void main(String[] args) {
	
	input = new Scanner (System.in);
	System.out.println("Input Your Age");
	int age = Integer.parseInt(input.nextLine());
	// defining an 'age' variable
	
	// checking the age
	if (age > 18 ) {
		System.out.print("Age is greater than 18");
	}
}
}
