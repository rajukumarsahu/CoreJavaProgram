
public class REverseArray {
	public static void main(String[] args) {
		String originalStr = "Hello raju";
	    String reversedStr = "";
	    System.out.println("Original string: " + originalStr);
	        
	    for (int i = 0; i < originalStr.length(); i++) {
	      reversedStr = originalStr.charAt(i) + reversedStr;
	    }
	    
	    System.out.println("Reversed string: "+ reversedStr);
	    int count=originalStr.split("\\s").length;
	    
	    System.out.println("count::"+count);
	  }
	} 
	
 
