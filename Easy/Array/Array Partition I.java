// Question => https://leetcode.com/problems/array-partition-i/
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int i=0;
        while(i<nums.length){
            sum += nums[i];
             i += 2;
        }
       
        return sum;
    }
}
// Time complexity => O(n)
