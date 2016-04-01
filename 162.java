public class Solution {
    public int findPeakElement(int[] nums) {
        return rec(nums, 0, nums.length - 1);
    }
    private int rec(int[] nums, int start, int end){
        if(end - start <= 1)
            return (nums[start] >= nums[end]) ? start : end;
        else{
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
                return mid;
            else if(nums[mid] < nums[mid - 1])
                return rec(nums, start, mid - 1);
            else
                return rec(nums, mid + 1, end);
        }
    }
}