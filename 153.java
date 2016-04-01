public class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(n <= 1) return nums[0];
        if(nums[0] < nums[n - 1])//not rotated at all
            return nums[0];
        int x = nums[0]; // find p such that nums[p] >=x && nums[p+1] < x;
        int start = 0;
        int end = n - 1;
        int mid;
        while(start < end - 1){
            mid = start + (end - start) / 2;
            if(nums[mid] >= x)
                start = mid;
            else
                end = mid;
        }
        return Math.min(nums[start], nums[end]);
    }
}