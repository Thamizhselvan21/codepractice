package codepractice;

public class TwoSumBruteForce { 
public static int[] twoSum(int[] nums, int target) 
{ 
	// Iterate through the array, checking each pair of numbers 
		for (int i = 0; i < nums.length; i++) 
		{  
            for (int j = i + 1; j < nums.length; j++) 
            { 
                // If the two numbers add up to the target, return their indices 
                if (nums[i] + nums[j] == target) 
                { 
                    return new int[] {i, j}; 
                } 
            } 
        } 
        // Throw an exception if no solution is found (this shouldn't happen) 
        throw new IllegalArgumentException("No two sum solution"); 
    } 
    public static void main(String[] args) { 
        // Example 1 
        int[] nums1 = {2, 7, 11, 15}; 
        int target1 = 9; 
        int[] result1 = twoSum(nums1, target1); 
        System.out.println("Indices: [" + result1[0] + ", " + result1[1] + "]"); 
 
        // Example 2 
        int[] nums2 = {3, 2, 4}; 
        int target2 = 6; 
        int[] result2 = twoSum(nums2, target2); 
        System.out.println("Indices: [" + result2[0] + ", " + result2[1] + "]"); 
 
        // Example 3 
        int[] nums3 = {3, 3}; 
        int target3 = 6; 
        int[] result3 = twoSum(nums3, target3); 
        System.out.println("Indices: [" + result3[0] + ", " + result3[1] + "]"); 
} 
}