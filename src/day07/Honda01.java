package day07;

public class Honda01 extends Bike01{

	void run() {
		System.out.println("method run honda");
		
	}
	public static void main(String[] args) {
		Bike01 b = new Honda01();
		b.run();
	}

}
