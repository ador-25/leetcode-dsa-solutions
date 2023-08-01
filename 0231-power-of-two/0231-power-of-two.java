class Solution {
    public boolean isPowerOfTwo(int n) {
        // Check if n is a positive integer
        if (n <= 0)
        {
            return false;
        }

        // Check if only one bit is set to 1 (i.e., n is a power of 2)
        return (n & (n - 1)) == 0;
    }
}