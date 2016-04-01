public class Solution {
    //find the position of the first true
    private int[] nums;
    private int target;
    private int findLeft(int left, int right){
        if(left == right){
            return left;
        }else if(right - left == 1){
            if(nums[left] == target)
                return left;
            else
                return right;
        }else{
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target){
                return findLeft(left, mid);
            }else{
                return findLeft(mid + 1, right);
            }
        }
    }
    private int findRight(int left, int right){
        if(left == right){
            return left;
        }else if(right - left == 1){
            if(nums[left] > target)
                return left;
            else
                return right;
        }else{
            int mid = left + (right - left) / 2;
            if(nums[mid] > target){
                return findRight(left, mid);
            }else{
                return findRight(mid + 1, right);
            }
        }
    }
    public int[] searchRange(int[] _nums, int _target) {
        nums = _nums;
        target = _target;
        int n = nums.length;
        if(n <= 0 || nums[0] > target || nums[n - 1] < target){
            return new int[]{-1,-1};
        }
        //assert true exist
        if(nums[n - 1] == target){
            return new int[]{findLeft(0, n - 1), n - 1};
        }
        else{
            int left = findLeft(0, n-1);
            int right = findRight(0, n - 1) - 1;
            if(left > right)
                return new int[]{-1, -1};
            else return new int[]{left, right};
        }
    }
    
}