//Brute Force Approach

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    a[0] = i;
                    a[1] = j;
                }
            }
            
        }
        return a;
    }
}

// Optimized Approach
// if hashmap contains target - nums[i] value than return it otherwise add the nums[i] to the haspmap along with the index.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}

// Time Complexity => O(n)

