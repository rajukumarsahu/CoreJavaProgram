
public class consecutive_1_s_in_the_array {
	 	    public static void main(String[] args) {
	        int[] nums = {1,1,0,1,1,1};
	        int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
	        System.out.println("The maximum number of consecutive 1's is: " + maxConsecutiveOnes);
	    }

	    public static int findMaxConsecutiveOnes(int[] nums) {
	        int maxCount = 0;
	        int currentCount = 0;
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] == 1) {
	                currentCount++;
	            } else {
	                if (currentCount > maxCount) {
	                    maxCount = currentCount;
	                }
	                currentCount = 0;
	            }
	        }
	        if (currentCount > maxCount) {
	            maxCount = currentCount;
	        }
	        return maxCount;
	    }
	}


