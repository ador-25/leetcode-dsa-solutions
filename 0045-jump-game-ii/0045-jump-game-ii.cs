public class Solution {
    public int Jump(int[] nums)
    {
        int res = int.MaxValue;
        int[] distances = new int[nums.Length];
        Array.Fill(distances,int.MaxValue);
        distances[0] = 0;
        for (int i = 0; i < nums.Length; i++)
        {
            int dist = nums[i] + i;
            for (int j = i + 1; j <= dist; j++)
            {
                if(j== nums.Length)
                break;
                distances[j] = Math.Min(distances[j], (distances[i]+1));
            }
        }
        return distances[nums.Length-1];
    }
}