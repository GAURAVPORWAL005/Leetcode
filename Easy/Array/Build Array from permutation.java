// Question => https://leetcode.com/problems/build-array-from-permutation/submissions/
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

// Time Complexity => O(n)
