// Question => https://leetcode.com/problems/valid-mountain-array/submissions/

class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        int left = 1;
        int right = arr.length-2;
        while(left <= right){
            if(arr[left] <= arr[left-1]){
                return false;
            }
            if(arr[right] <= arr[right+1]){
                return false;
            }
            if(arr[left] < arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return true;
    }
}

// Time Complexity => O(n)
