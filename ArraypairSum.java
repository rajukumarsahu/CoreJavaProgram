
public class ArraypairSum {
	public static void main(String[] args) {
		int [] a1= {2,3,4,5,6,7,8};
		int target=9;
		ArraypairSum.sum(a1,target);
		
	}

	public static void sum(int[] a1,int target) {
		
		for(int i=0;i<a1.length;i++ ) {
			int count=0;
				for(int j=0;j<a1.length;j++) {
					if(a1[i]+a1[j]==target) {
						System.out.println("pair found:"+a1[i]+","+a1[j]);
						count=count+1;
						System.out.println(count);
						return; 
				}
			}
			
			
		}
	}
}
