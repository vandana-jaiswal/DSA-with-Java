// / question  1


// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]
 



// solution 2 in lc
class TwoSum2 {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == temp) {
                    return new int[] { i, j };
                }
            }
        }
        
        return new int[]{};
        
    }
}
