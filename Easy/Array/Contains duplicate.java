// Question => https://leetcode.com/problems/contains-duplicate/submissions/
// brute force approach
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
            return false;
    }
}
// Time complexity => O(logn)
