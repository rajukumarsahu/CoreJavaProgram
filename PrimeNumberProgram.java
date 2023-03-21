
public class PrimeNumberProgram {

	public static boolean prime(int n) {
		if(n<=1)
			return false;
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
			
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=100;i++) {
			if(prime(i)) {
				System.out.print(" ,"+i);
			}
		}
		
		int n=12;
		if(prime(n)) {
			System.out.println("Prime");
		}
		else {
			System.out.println("not prime");
		}
	}

}
