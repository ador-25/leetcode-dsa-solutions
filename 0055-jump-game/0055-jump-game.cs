public class Solution {
    public bool CanJump(int[] nums)
    {

        int nearestEscapeIndex = nums.Length - 1;
        for (int i = nums.Length-2; i >= 0; i--)
        {
            if (i + nums[i] >= nearestEscapeIndex)
                nearestEscapeIndex = i;
        }
        
        if(nearestEscapeIndex ==0)
            return true;
        
        for (int i = 0; i < nums.Length-1; i++)
        {
            if (i + nums[i] >= nearestEscapeIndex)
                return true;
            if(nums[i]==0)
                break;
        }
        return false;
    }
}