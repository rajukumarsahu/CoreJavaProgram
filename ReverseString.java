
public class ReverseString 
{
	 
	public static void main(String[] args) 
	{ 
		  String s1="HELLO";
		  reverseString(s1);
    }
public static void reverseString(String str) 
{
		
		char[] ch=str.toCharArray();
		System.out.println("after reverse string are :");
		for(int i=ch.length-1;i>=0;i--) 
		{
			System.out.print(ch[i]);
		}
 }
	 
}
