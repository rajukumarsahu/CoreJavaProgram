import java.util.Arrays;
import java.util.Comparator;

public class FindHigest {
	public static void main(String[] args) {
	
		int [] number= {3,4,6,2,8,9};
		//System.out.println("number in a array");
		
			int SecondLargenumber=Arrays
			.stream(number)
			.boxed()
			.sorted(Comparator.reverseOrder())
			.skip(1)
			.findFirst()
			.get();
			System.out.println("the second highest no is:"+SecondLargenumber);
	}
}
