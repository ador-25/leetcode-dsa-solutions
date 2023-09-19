public class Solution {
    public int[][] FloodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) dfs(ref image, sr, sc, color, newColor);
        return image;
    }
    public void dfs(ref int[][] img, int row, int col, int color, int newColor)
    {
        if (img[row][col] == color)
        {
            img[row][col] = newColor;
            if (row > 0) dfs(ref img, row - 1, col, color, newColor);
            if (col > 0) dfs(ref img, row, col - 1, color, newColor);
            if (row + 1 < img.Length) dfs(ref img, row + 1, col, color, newColor);
            if (col + 1 < img[row].Length) dfs(ref img, row, col + 1, color, newColor);
        }
    }
    
}