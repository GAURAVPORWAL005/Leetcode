// Question => https://leetcode.com/problems/single-element-in-a-sorted-array/
// Brute force approach using Bit Manipulation
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

// Better Approach using loops
class Solution {
    public int singleNonDuplicate(int[] nums) {
        for(int i=0;i<=nums.length-1;i = i+2){
             if(i == nums.length-1){
                return nums[i];
            }
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[0];
    }
}
// Time complexity => O(n)
