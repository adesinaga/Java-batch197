package day03;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static void staircase(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i+j>=n-1) {
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
			}
		}

    }

}
