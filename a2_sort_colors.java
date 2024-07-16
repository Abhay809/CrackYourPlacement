// https://leetcode.com/problems/sort-colors/description/

class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int index=0;
        while(index<=end){
            if(nums[index]==0){  // then we will send 0 to the start place or first place
                swap(nums,index,start);
                index++;
                start++;
            }else if(nums[index] == 2){
                swap(nums,index,end);
                end--;
            }else{   // now 1 is left only
                index++; // means skip the 1
            }
        }
        
    }
    public void swap(int nums[],int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
