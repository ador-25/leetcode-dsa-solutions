class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result= new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(max<candies[i])
                max=candies[i];
        }
        for(int i=0;i<candies.length;i++){
            result.add(candies[i]+extraCandies>=max);
        }
        return result;
    }
}