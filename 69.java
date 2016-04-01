public class Solution {
    public int mySqrt(int x) {
        if(x < 0) return 0;
        int start = 0, end = 46340, mid;
        while(true){
            if(start == end)
                return start;
            if(end - start == 1)
                return end * end <= x ? end : start;
            mid = (start + end) / 2;
            if(mid * mid <= x)
                start = mid;
            else
                end = mid;
        }
    }
}