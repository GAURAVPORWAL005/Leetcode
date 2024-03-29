// Question => https://leetcode.com/problems/remove-element/submissions/

// Appraoch 1 

class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(val != nums[i]){
                list.add(nums[i]);
            }
        }
            
            for(int i=0;i<list.size();i++){
                nums[i] = list.get(i);
        }
        return list.size();
    }
}

// Approach 2

class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}



