package day01;

public class SimpleArraySum {

	public static void main(String[] args) {
		System.out.println(simpleArraySum(new int[] { 1, 2, 3, 4 }));
		System.out.println(simpleArraySum(new int[] { 1, 2, 3, 4, 23 ,10 }));
		System.out.println(simpleArraySum(new int[] { 3, 4 }));
		int jml=simpleArraySum(new int[] {5555,3344,4554});
		System.out.println(jml);
		
	}

	static int simpleArraySum(int[] ar) {
	int hasil  = 0;
	for (int i = 0; i<ar.length; i++) {
		hasil+=ar[i];
		
	}
	return hasil;
	
	}
}
