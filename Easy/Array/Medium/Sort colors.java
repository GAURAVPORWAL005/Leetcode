// Question => https://leetcode.com/problems/sort-colors/
// Brute force approach
class Solution {
    public void sortColors(int[] nums) {
        int temp = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] > nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}

// Time complexity => O(n^2)

// Optimized Approach
class Solution {
    public void sortColors(int[] nums) {
        int c = 0;
        int temp =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                 temp = nums[i];
                nums[i] = nums[c];
                nums[c] = temp;
                c++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                temp = nums[i];
                nums[i] = nums[c];
                nums[c] = temp;
                c++;
            }
        }
    }
}

// Time complexity = > O(n)
