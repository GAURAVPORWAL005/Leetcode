// Question => https://leetcode.com/problems/peak-index-in-a-mountain-array/
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int max = -1;
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}

// Time complexity => O(n)
