package Problem.practise;

public class L1 {

	
	    public static void main(String[] args) {
	        int[] arr = new int[100];

	        for (int i = 0; i < 100; i++) {
	            int num = (i + 1) * 9;
	            int lastTwoDigits = num % 100;
	            
	            if (Math.abs(lastTwoDigits / 10 - lastTwoDigits % 10) == 3) {
	                arr[i] = -num;
	            } else {
	                arr[i] = num;
	            }
	        }

	        // display the array elements
	        for (int i = 0; i < 100; i++) {
	            System.out.print(arr[i] + ",");
	        }
	    }
	}

