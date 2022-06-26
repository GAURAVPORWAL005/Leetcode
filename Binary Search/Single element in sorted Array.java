// Question => https://leetcode.com/problems/single-element-in-a-sorted-array/
// Brute force approach
class Solution {
    public int singleNonDuplicate(int[] nums) {
       int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum ^ nums[i];
        }
        return sum;
    }
}
// Time complexity => O(n)
