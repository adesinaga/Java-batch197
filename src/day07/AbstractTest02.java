package day07;

public class AbstractTest02 {
	public static void main(String[] args) {
		Bank01 b1;
		b1 = new SBI01();
		System.out.println("Rate Of Interest is : " + b1.getRateOfInterest());
		b1 = new PNB01();
		System.out.println("Rate Of Interest is :" + b1.getRateOfInterest());
	}
}
