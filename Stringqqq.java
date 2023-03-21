
public class Stringqqq {

	public static void main(String[] args) {
		String original="New Area Shekhar kumar";
		String rev="";
		System.out.println("Ori::"+original);
		for(int i=0;i<original.length();i++) {
			rev=original.charAt(i)+rev;
		}
		System.out.println(rev);
		
		int countWords = original.split("\\s").length;
		System.out.println(countWords);
	}
}
