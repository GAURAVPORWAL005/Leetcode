// Question => https://leetcode.com/problems/max-consecutive-ones/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                current++;
            }
            else{
                current = 0;
            }
        
        max = Math.max(current,max);
        }
        return max;
    }
}
// Time complexity => O(n)
// Space complexity => O(1)
