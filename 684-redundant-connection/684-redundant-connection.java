class Solution {
    static class UnionFind{
        int []arr;
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
        public boolean makeFriend(int a, int b){
            int x=find(a);
            int y=find(b);
            if(x==y)return false;
            else arr[y]=x ;
            return true;
            
        }

    }
    public int[] findRedundantConnection(int[][] edges) {
        UnionFind u= new UnionFind(edges.length);
        for(int [] item : edges){
            if(!u.makeFriend(item[0],item[1]))
                return item;
        }

        return null;
    }
}