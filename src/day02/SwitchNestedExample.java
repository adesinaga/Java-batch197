package day02;

public class SwitchNestedExample {

	public static void main(String[] args) {
		char branch = 'C';
		int collegeYear = 4;
		switch  (collegeYear) {
		case 1 :
			System.out.println("English, Maths, Science");
			break;
		case 2:
			switch (branch) {
			case 'C' :
				System.out.println("Operating System, Java, Data Structure");
				break;
			case 'E' :
				System.out.println("Microprosesor, Logic Switching Theory");
				break;
			case 'M' :
					System.out.println("Drawing, Manufacturing Machines ");
					break;
					
			}
			break;
			
		case 3:
			switch (branch) {
			case 'C' :
				System.out.println("Computer Organizations, Multimedia");
				break;
			case 'E' :
				System.out.println("jjdjd, fkfkf");
				break;
			case 'M' :
					System.out.println("hssjsjjs ");
					break;
			}
			
		case 4:
			switch (branch) {
			case 'C' :
				System.out.println("ssjjsj, Mhdhdh");
				break;
			case 'E' :
				System.out.println("sdkkdkdkkd, shhhhhhhh");
				break;
			case 'M' :
					System.out.println("dmmdmdm, haloha ");
					break;
			}
			}
		}

	}

