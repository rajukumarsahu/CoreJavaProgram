package Problem.practise;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for(int i=1;i<=r;i++) {
			for(int j=i;j<=r;j++) {
				System.out.print("*");
			}
			 System.out.println();
		}
		
		 
	}
}
