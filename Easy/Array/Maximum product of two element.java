
// Brute force Approach using two loops
class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]-1) * (nums[j]-1) > max){
                    max = (nums[i]-1) * (nums[j]-1);
                }
            }
        }
        return max;
    }
}
// TIme  complexity => O(n2)

// Better Approach using soritng
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
      int max = (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
        return max;
    }
}
// Time complexity => O(logn)
