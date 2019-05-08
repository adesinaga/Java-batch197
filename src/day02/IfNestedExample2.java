package day02;

public class IfNestedExample2 {

	public static void main(String[] args) {
		int age = 25;
		int weight = 48;
		if (age >=18) {
			if (weight > 50) {
				System.out.println("you are eligible to donate blood");
			}
			else {
				System.out.println("you are not eligible to donate blood");
			}
		}
		else {
			System.out.println("age must be greater than 18");
		}

	}

}
