class Solution
{
    public bool ContainsDuplicate(int[] nums)
    {
        HashSet<int> set = new HashSet<int>();
        set.Add(nums[0]);
        for (int i = 1; i < nums.Length; i++)
        {
            if (set.Contains(nums[i]))
            {
                return true;
            }
            set.Add(nums[i]);
        }
        return false;
    }

}

