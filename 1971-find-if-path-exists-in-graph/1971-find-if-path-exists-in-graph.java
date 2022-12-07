class Solution {
    static class UnionFind{
        int []arr;
        public UnionFind(int n){
            arr=new int[n+1];
            for (int i=0;i<arr.length;i++){
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
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
       // if(edges.length==0)return false;

        UnionFind u=new UnionFind(n);
        for(int i=0;i<edges.length;i++){
            u.union(edges[i][0],edges[i][1]);
        }
        System.out.println(u.find(source)+" "+u.find(destination));
        return u.find(source)==u.find(destination);
    }
}