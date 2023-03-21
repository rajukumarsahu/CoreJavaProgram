
public class MethodProg {   
	  int a;
	  
	 
	  
 
 
	public MethodProg(int i) {
		this.a=i;
	}



	public MethodProg() {
		 
	}



	public void MetodArray(int a,int b) {
		
		int c=a+b;
		System.out.println("Array method called"+c);
	}
	 


	public static void main(String[] args) { 
		//int []a = {10,2};
		 
		MethodProg mp = new MethodProg(10);
		//mp.a=10;
		MethodProg mp1 = new MethodProg(10);
		
		 int a= (mp.a)+(mp1.a);
		  
		System.out.println( "Sum of two:"+a);
		 
		 
	} 
}
