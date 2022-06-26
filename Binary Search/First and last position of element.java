// Question => https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

// Brute force Approach
// Use Two Pointer Approach
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        if(nums.length == 1 && nums[0] == target){
            ans[0] = 0;
            ans[1] = 0;
        }
        
        // find the starting index
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                ans[0] = i;
                break;
            }
        }
        
        // Find the last index
        for(int j = nums.length-1;j>=0;j--){
            if(nums[j] == target){
                ans[1] = j;
                break;
            }
        }
        return ans;
    }
}

// Time complexity => O(n)

// Optimized Approach
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = 0;
        int end = nums.length-1;
        
        // Check first occurence
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                ans[0] = mid;
                end = mid - 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        
        // Second Occurence
         start = 0;
         end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                ans[1] = mid;
                start = mid + 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
// Time complexity => O(logn)
