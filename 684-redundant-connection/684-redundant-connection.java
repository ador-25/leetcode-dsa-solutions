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
        public boolean makeFriend(int a, int b){
            int x=find(a);
            int y=find(b);
            if(x==y)return false;
            else arr[y]=x ;
            return true;
            
        }
        //graphs in forest
        public int numberOfProvinces(){
            HashSet<Integer> set= new HashSet<>();
            for(int i=1;i<arr.length;i++)
                set.add(find(arr[i]));
            return set.size();
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