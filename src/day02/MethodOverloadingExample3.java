package day02;

public class MethodOverloadingExample3 {
	public static void main(String[] args) {
System.out.println("main with String[]");
	}
	public static void main(String args) {
		System.out.println("main with String");
	}
	public static void main() {
		System.out.println("main without String");
	}
}
