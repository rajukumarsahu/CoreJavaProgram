package Problem.practise;

public class Arrar1 {

	public static void main(String[] args) {
		int[] arr= {1,3,5};
	m1(arr);
	m2(arr);
	
	}
	
	public static void m1(int arr[]) {
		System.out.println("M1");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void m2(int arr1[]) {
		System.out.println("m2");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}
}
