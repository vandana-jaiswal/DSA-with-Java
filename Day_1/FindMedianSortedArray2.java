// question 2

// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.
// Example 2:

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.




// solution 2 in lc
class FindMedianSortedArray2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int[] mergeArray = new int[nums1.length+nums2.length];
        int index = 0;

        for(int x : nums1){
            mergeArray[index++] = x;
        }

        for(int x : nums2){
            mergeArray[index++] = x;
        }

        Arrays.sort(mergeArray);

        int n = mergeArray.length;

        if(n%2==0){
                return ((mergeArray[n/2] + mergeArray[n/2-1])/2.0);
        }else{
            return (mergeArray[n/2]);
        }
      }
}
