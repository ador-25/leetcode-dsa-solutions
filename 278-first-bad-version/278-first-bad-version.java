/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=0,right=n;
        while(left<=right){
            int pivot=left+right >>>1;
            if(isBadVersion(pivot)){
                right=pivot-1;
            }
            else{
                left=pivot+1;
            }
        }
        return left;
    }

}