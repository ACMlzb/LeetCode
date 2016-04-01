/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return find(1, n);
    }
    public int find(int from, int to){
        //the first bad version must be within from and to, inclusive
        if(from == to)
            return from;
        int mid = from + (to - from) / 2;
        boolean isBad = isBadVersion(mid);
        if(isBad)
            return find(from, mid);
        else
            return find(mid + 1, to);
    }
}