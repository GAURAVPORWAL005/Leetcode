// Question => https://leetcode.com/problems/find-the-duplicate-number/
// Brute Force Appraoch
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                ans = nums[i];
          }
        }
        return ans;
    }
        
}

// Time complexity => O(nlogn)


// Optimized Approach
class Solution {
    public int findDuplicate(int[] nums) {
        int ans = 0;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
              if(res[nums[i]] == 1){
                ans = nums[i];
            }
            res[nums[i]] = 1;
           
           
        }
            return ans;
    }
}

// Time complexity => O(n)
