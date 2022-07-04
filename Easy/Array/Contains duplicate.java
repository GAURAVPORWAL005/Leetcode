// Question => https://leetcode.com/problems/contains-duplicate/submissions/
// Brute force Approach using extra approach
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i])){
        return true;
        }
            set.add(nums[i]);
        }
        return false;
    }
}
// Time complexity => O(n)
// Space complexity => O(n)
//  Optimized approach
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

