class Solution
{
    public bool ContainsDuplicate(int[] nums)
    {
        var span = nums.AsSpan();
        HashSet<int> set = new HashSet<int>();
        for (int i = 0; i < span.Length; i++)
        {
            if (set.Contains(span[i]))
            {
                return true;
            }
            set.Add(span[i]);
        }
        return false;
    }

}

