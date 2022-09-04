https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/submissions/
class Solution {
    public boolean check(int[] nums) {
        int iregularity = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > nums[(i+1) % nums.length]){
                iregularity++;
            }
        }
        return iregularity > 1 ? false:true;
    }
}
// time complexity => O(n)
