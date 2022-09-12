class Solution {
   public boolean isPerfectSquare(int num) {
        if(num==1)
            return true;
        int left=1,right=num;
        while (left<(right-1)){
            int pivot=(left+right)>>>1;
            if(pivot*pivot==num) {
                return true;
            }
            else if(pivot>num/pivot)
                right=pivot;
            else
                left=pivot;
        }
        return false;

    }
}