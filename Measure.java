import java.util.Scanner;

public class Measure {

	public static void main(String[] args) {
		final double weight=5.5;
		final double Height=8.5;
		
		double  area=weight*Height;
		System.out.println(weight+"*"+Height+"::"+area);
		
		double  Parameter=2*(weight+Height);
		System.out.println(weight+"*"+Height+"::"+Parameter);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int n=sc.nextInt();
		
		
		
		if(n<0) {
			System.out.println("Enter A -ve");	
		}
		else if(n>0){
			System.out.println("Enter A +ve");
		}
		
		else {
			System.out.println("ITS a zero");
		}
		
	}
}
