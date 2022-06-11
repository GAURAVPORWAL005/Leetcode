// Question => https://leetcode.com/problems/next-permutation/submissions/
class Solution {
    public void nextPermutation(int[] nums) {
        for(int i=nums.length-1;i>0;i--){
            if(nums[i] > nums[i-1]){
                Arrays.sort(nums,i,nums.length);
            
            for(int j=i;j<nums.length;j++){
                if(nums[j] > nums[i-1]){
                    int temp = nums[j];
                    nums[j] = nums[i-1];
                    nums[i-1] = temp;
                    break;
                }
            }
            break;
        }
        else if(i==1){
            Arrays.sort(nums);
            }
        }
    }
}

// Time complexity => O(N^2)
