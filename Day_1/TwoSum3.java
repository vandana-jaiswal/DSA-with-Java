// question  1

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
 



//solution 3 in vs
// import java.util.Arrays;
// class Solution {

//     public  static int[] twoSum(int[] nums, int target) {
//         for(int i=0;i<nums.length;i++){
//             int temp = target - nums[i];
//             for(int j=0;j<nums.length;j++){
//                 if(nums[j]==temp){
//                     return new int[]{i,j}; 
//                 }
//             }

//         }
//         return new int[]{};
         
//     }
//     public static void main(String[] args) {
//         int[] ar = {2,3,0,5};
//         int target = 5;
         
//         int [] data = twoSum(ar, target);

//         System.out.println(Arrays.toString(data));

//     }
// }

// solution 4 in lt  
// import java.util.HashMap;
// class Solution {
//     public int[] twoSum(int[] nums, int target) {

//         HashMap<Integer,Integer> map = new HashMap<>();

//         for(int i=0; i<nums.length; i++){
//             int temp = target - nums[i]; 

//             if(map.containsKey(temp)){
//                 return new int[]{map.get(temp),i};
//             }
//             map.put(nums[i],i);
//         }

//         return new int[]{};
// }
// }





