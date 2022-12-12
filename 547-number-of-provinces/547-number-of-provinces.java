class Solution {
    static class UnionFind{
        int []arr;
        public UnionFind(char [][]c){
            int n= c.length*c[0].length;
            arr= new int[n+1];
            for(int i=0;i<n+1;i++){
                arr[i]=i;
            }
        }
        public UnionFind(int n){
            arr=new int[n+1];
            for (int i=1;i<arr.length;i++){
                arr[i]=i;
            }
        }
        public int find (int  x){
            if(arr[x]==x)
                return x;
            else return find(arr[x]);
        }
        public void union(int a, int b){
            int x=find(a);
            int y=find(b);
            if(x==y)return;
            else arr[y]=x;
        }
        public int numberOfProvinces(){
            HashSet<Integer> set= new HashSet<>();
            for(int i=1;i<arr.length;i++)
                set.add(find(arr[i]));
            return set.size();
        }
    }
    public int findCircleNum(int[][] isConnected) {
        UnionFind u= new UnionFind(isConnected.length);
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]==1 ) u.union(i+1,j+1);
            }
        }
        int res=u.numberOfProvinces();
        return res;
    }
}