package Problem.practise;

public class RepeatedStringCount {
	public static void main(String[] args) {
	String s="Raju is is kumar sahu";
	int count =1;
	String[] s1=s.split(" ");
	
	for(int i=0;i<s1.length;i++) {
		for(int j=i+1;j<s1.length;j++) {
			if(s1[i].equals(s1[j])) {
			count=count+1;
			s1[j]="0";
			}
		} 
		if(s1[i]!="0") {
			//count=1;
			System.out.println(s1[i]+"-----"+count);
			count=1;
		}
		
	}  } } 