
public class StringDub {

	public static void main(String[] args) { 
		String s1 = "Hello Great"; 
		StringDub.dublicate(s1);
		System.out.println(s1);
		reverseString(s1);
	} 
	private static void dublicate(String s1) {
		System.out.println("common char  "+s1);
		int count;
		char string[] = s1.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			count = 1;
			for (int j = i + 1; j < s1.length(); j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++; 
					string[j] = '0';
				}
			}
			if (count > 1 && string[i] != '0') {

				System.out.println(string[i]);
			}
		}

	}
	
	public static void reverseString(String str) {
		
		char[] ch=str.toCharArray();
		System.out.println("after reverse string are :");
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
	}
}
