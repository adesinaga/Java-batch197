package day02;

public class MethodParameterExample {
	public static void main(String[] args) {
		int a = 30;
		int b = 45;
		System.out.println("before swapping, a= " + a + " and b = " + b);
		swapFunction(a, b);
		System.out.println("\n**Now, Before and After swapping values will be same here**:");
		System.out.println("After swapping, a=" + a + " and b = " + b);
	}

	public static void swapFunction(int a, int b) {
		System.out.println("Before swapping (inside), a = " + a + "b = " + b);
		// swap n1 with n2
		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping (inside), a = " + a + " b = " + b);
	}
}
