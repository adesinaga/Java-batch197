package HackerRank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {
	public static void main(String[] args) {
		System.out.println(birthday(new ArrayList<Integer>(Arrays.asList(2,2,1,3,2)),4,2));
		System.out.println(birthday(new ArrayList<Integer>(Arrays.asList(4,4,1,4)),4,1));
	}
	
	// Complete the birthday function below.
	  static int birthday(List<Integer> s, int d, int m) {
		    int length = s.size();
		    int numWays = 0, sum = 0;

		    for(int i = 0 ; i <= (length - m) ; i++){
		        for(int j = 0 ; j < m ; j++){
		            sum = sum + s.get(j+i);
		        }
		        if(sum == d){
		            numWays++;
		        }
		        sum = 0;
		    }
		    return numWays;
		}
	 
}
