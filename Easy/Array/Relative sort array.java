// Question => https://leetcode.com/problems/relative-sort-array/
// Brute force Approach
/* Loop throught all array compare and add in the list
loop again arr1 to find left numbers
create a new arr[] to store these numbers
Sort and append to the list
convert list to arr
return */

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr1[j] == arr2[i]){
                    list.add(arr1[j]);
                }
            }
        }
        int len = arr1.length-list.size();
        int[] lastPart = new int[len];
        int index = 0;
        for(int i=0;i<arr1.length;i++){
            if(!list.contains(arr1[i])){
            lastPart[index++] = arr1[i];
        }
    }
        Arrays.sort(lastPart);
        for(int i=0;i<len;i++){
            list.add(lastPart[i]);
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
// Time complexity => o(n2)
// Space complexity => O(n)
