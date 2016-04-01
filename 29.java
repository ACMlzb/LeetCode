public class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == 0 || dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        boolean positive = dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0;
        long dvd = Math.abs((long)dividend);
        long dvs = Math.abs((long)divisor);
        long ans = 0;
        while(dvd >= dvs){
            long tmp = dvs;
            long inc = 1;
            while(dvd >= (tmp << 1)){
                tmp <<= 1;
                inc <<= 1;
            }
            ans += inc;
            dvd -= tmp;
        }
        return (int) (positive? ans : -ans);
    }
}