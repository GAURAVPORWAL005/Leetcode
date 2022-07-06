// Question => https://leetcode.com/problems/shuffle-the-array/

// Two pointer Approach
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
       int i = 0;
        int j = n;
        int k = 0;
            while(i<n && j<2*n){
                if(k%2 == 0){
                    ans[k++] = nums[i++];
                }
                    ans[k++] = nums[j++];
             }
        return ans;
    }
}
// Time complexity => O(n)

// Optimized Approach
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int t=0;
        for(int i=0;i<n;i++){
        ans[t++] = nums[i];
            ans[t++] = nums[i+n];
            
        }
        return ans;
    }
}
// Time complexity => O(n)
