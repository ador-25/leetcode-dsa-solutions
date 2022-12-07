class Solution {
    static int[]p;
public static int find (int  x){
        if(p[x]==x)
            return x;
        else return p[x]=find(p[x]);
    }

    public int numIslands(char[][] grid) {

        int numberOfIslands=0;
        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    numberOfIslands++;
                }
            }
        }

        int [][]dis= new int[][]{{ 1, 0 },
                                 { -1, 0 },
                                 { 0, 1 },
                                 { 0, -1 }};
        int n=grid.length;
        int m=grid[0].length;
        p= new int[m*n];
        for(int i=0;i<p.length;i++)
            p[i]=i;

        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    int p1= find(i *m + j );
                    for(int it=0;it<4;it++){
                        int r= i+dis[it][0];
                        int c= j+dis[it][1];
                        if(r>=0 && r<n && c>=0 && c<m && grid[r][c]=='1'){
                            int p2= find(r*m+c);
                            if(p1!=p2){
                                p[p2]=p1;
                                numberOfIslands--;
                            }
                        }

                    }
                }
            }
        }

        return numberOfIslands;
    }
}