import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrrayProg {

	public static void main(String[] args) {
		Integer arrr[]= {4,5,6,7,8,9,9};
		int arr[]=new int[] {1,2,3,4,5,5};
		System.out.println("OriginalArray"+arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("Reverse A array");
		for (int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);	
		}
		System.out.println();
		System.out.println("Remove Dublicate  in array");
		 List<Integer> l = new ArrayList<Integer>(Arrays.asList(arrr));
		 l.add(99);
		 l.add(2, 55);
	        System.out.println(l);
		Set<Integer> set=new LinkedHashSet<>(l);
		//set.addAll(set);
		System.out.print(set);
		 
	}
}
