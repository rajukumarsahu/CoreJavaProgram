
public class NumberPelindrome {

	public static void main(String[] args) {
		 int a=121;
		 int num=a ,rem=0,sum=0;
		 System.out.println(a);
		  
		 
		 while(a>0) {
			 rem=a%10;
			 sum=(sum*10)+rem;
			 a=a/10;
		 }
		 if(num==sum) {
			 System.out.println("pelindrome");
		 }
		 else {
			 System.out.println("not");
		 }
			 
		  
	}
}
