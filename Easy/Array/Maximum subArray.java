// Question => https://leetcode.com/problems/maximum-subarray/submissions/

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum = sum + nums[i];
            max = Math.max(sum,max);
            if(sum < 0)
                sum = 0;   
        
            }
    return max;
                }
                    }
