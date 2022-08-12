class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answers= new ArrayList<>();
        int max= Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max)
                max=candies[i];
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max)
                answers.add(true);
            else answers.add(false);
        }
        return answers;
    }
}