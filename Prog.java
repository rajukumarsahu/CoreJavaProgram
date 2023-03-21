 class Hello{
	 public String reverse(String s) {
	 
	 char[] char1=s.toCharArray();
	 String revStr="Hello:";
	 for(int i=char1.length-1;i>=0;i--) {
		 
		 //System.out.print(char1[i]);
	revStr=revStr+char1[i];	 
		 
	 }
return revStr;
}
 }
public class Prog {

	
	public static void main(String[] args) {
	String s="raju";
	System.out.println(s);
	
	Hello h=new Hello();
	String revString=h.reverse(s);
	System.out.println(revString);
	
	}
}
