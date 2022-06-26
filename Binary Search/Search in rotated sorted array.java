// Question => https://leetcode.com/problems/search-in-rotated-sorted-array/
// Brute force Approach
class Solution {
    public int search(int[] nums, int target) {
        int ans = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                ans = i;
            }
        }
        return ans;
    }
}
// Time complexity => O(n)
