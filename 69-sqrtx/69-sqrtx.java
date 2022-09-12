class Solution {
    public int mySqrt(int x) {
        if(x==0)
            return x;
        int left=1,right=x;

        while(left<(right-1)){
            int pivot=(left+right)>>>1;
            if(pivot>x/pivot){
                right=pivot;
            }
            else {
                left = pivot;
            }

        }
        return left;
    }
}