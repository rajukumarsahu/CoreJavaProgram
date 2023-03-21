package Problem.practise;

import java.util.Scanner;

public class StringTest {
 public static void main(String[] args) {
	
	 Scanner sc=new Scanner(System.in);
	 String s1= sc.nextLine();
	 String rev="";
	 char[] charr=s1.toCharArray();
	  int len=charr.length-1;
	 for(int i=0;i<len;i++,len--) {
		 char temp=charr[i];
		 charr[i]=charr[len];
		 charr[len]=temp;
	 }
	 
	 for(char ch:charr) {
	
		 System.out.print(ch);
		 
	 }
	 
			 
}
}
