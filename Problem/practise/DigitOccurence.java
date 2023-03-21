package Problem.practise;

public class DigitOccurence {
	public static void main(String[] args) {
		
		int a[]= {1,3,3,3,5,6,6,6,6,6,6,6};
		
		int maxcount=0;
		int mostoccurance=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>maxcount) {
				maxcount=count;
				mostoccurance = a[i];
			}
		}
		System.out.println(mostoccurance);
	}

}
