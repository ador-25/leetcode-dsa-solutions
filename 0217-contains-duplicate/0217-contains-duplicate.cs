class Solution
{
    public bool ContainsDuplicate(int[] nums)
    {
        Span<int> span = new Span<int>(nums);
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

