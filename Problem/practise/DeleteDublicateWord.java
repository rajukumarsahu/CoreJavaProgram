package Problem.practise;

public class DeleteDublicateWord {

	public static void main(String[] args) {
		String s="Raju kumar sahu Raju";
		String [] s1=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			if(s1[i]!=null) {
				for(int j=i+1; j<s1.length;j++) {
					if(s1[i].equals(s1[j])) {
						s1[j]=null;
					}
				}
			}
		}
		for(int j=0;j<s1.length;j++) {
			if(s1[j]!=null) {
				System.out.println(s1[j]);
			}
		}
	}
}
