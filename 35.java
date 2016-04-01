public class Solution {
    public int searchInsert(int[] nums, int target) {
        return rec(nums, target, 0, nums.length - 1);
    }
    private int rec(int[] nums, int target, int start, int end){
        if(end - start <= 1){
            if(target < nums[start]) return start;
            if(target > nums[end]) return end + 1;
            if(target == nums[start]) return start;
            if(target == nums[end]) return end;
            else return start + 1;
        }
        else{
            int mid = start + (end - start) / 2;
            if(target == nums[mid]) return mid;
            else if(target < nums[mid]) return rec(nums, target, start, mid - 1);
            else return rec(nums, target, mid + 1, end);
        }
    }
}