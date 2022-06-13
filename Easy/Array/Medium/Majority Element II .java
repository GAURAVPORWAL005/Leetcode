    // QUestion => https://leetcode.com/problems/majority-element-ii/submissions/ 
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(!ans.contains(nums[i])){
                       int count = 1;
            for (int j = i+1; j < n; j++) {
                
                if(nums[j] == nums[i]) count++;
            }
            if (count > n/3) {
                ans.add(nums[i]);
            }
            else if(n/3 == 0){
                ans.add(nums[i]);
                }
            }
        }
        return ans;
    }
}

// TIme complexity => O(n^2)

// Optimized Approach
// Moore voting Algorithm
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1 = -1, num2 = -1, count1 = 0, count2 = 0;
        int n  = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] == num1){
                count1++;
            }
            else if(nums[i] == num2){
                count2++;
            }
            else if(count1 == 0){
                num1 = nums[i];
                count1++;
            }
            else if(count2 == 0){
                num2 = nums[i];
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> list = new ArrayList<>();
         count1 = 0;
         count2 = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == num1){
                count1++;
            }
            else if(nums[i] == num2){
                count2++;
            }
        }
            if(count1 > n/3){
                list.add(num1);
            }
            if(count2 > n/3){
                list.add(num2);
            }
        
            return list;
    }
}
