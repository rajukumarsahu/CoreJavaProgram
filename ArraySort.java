import java.util.Comparator;
import java.util.TreeSet;

class Comp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s1.compareTo(s2);
	}
	
}


public class ArraySort  {
	 
	    public static void main(String[] args)
	    {
	    	String names[] = { "Raju", "Munna", "Dipanshu" };
	    	TreeSet t=new TreeSet<>(new Comp());
	    	t.add("Raju");
	    	t.add("Kumar");
	    	t.add("yy");
	    	t.add("A");
	    	t.add(new StringBuffer("CCC"));  
	    	System.out.println(t);
	        //int n = 0; 
	        String temp; 
	        for (int i = 0; i < names.length; i++) {
	            for (int j = i + 1; j < names.length; j++) {
	               
	                // to compare one string with other strings
	                if (names[i].compareTo(names[j]) > 0) {
	                    // swapping
	                    temp = names[i];
	                    names[i] = names[j];
	                    names[j] = temp;
	                }
	            }
	        }
	       
	        System.out.println("The names in alphabetical order are:");
	        for (int i = 0; i < names.length; i++) {
	            System.out.println(names[i]);
	        }
	    }

		 
		 
		 
	} 

