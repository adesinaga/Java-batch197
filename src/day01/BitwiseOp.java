package day01;

public class BitwiseOp {
	public static void main(String[] args) {
		int a =  60;
		int b = 13;
		int c = 0;
		//operator AND
		c = a & b ; 
		System.out.println("a & b =" + c);
		//Operator OR
		c = a | b;
		System.out.println(" a | b = " + c );
		//Operator XOR
		c = a ^ b ;
		System.out.println("a ^ b=" + c );
		//OperatorCompliment
		c = ~a;
		System.out.println("~a = " + c );
		//Left Shift
		c = a << 2;
		System.out.println("a << 2= " + c );
		//rightshift
		c = a >> 2;
		System.out.println("a >> 2= " + c );
		//Zero fill right shift
		c = a >>> 2;
		System.out.println("a >>> 2= " + c );
	}

}
