public class Solution {
    public int NumberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int res=0;
        for(int i=0;i<hours.Length;i++)
            res=hours[i]>=target? res+1:res;
        return res;
    }
}