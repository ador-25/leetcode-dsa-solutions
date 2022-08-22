class Solution {
    public int maximumPopulation(int[][] logs) {
        int max=Integer.MIN_VALUE;
        int []years= new int[101];
        for(int i=0;i<logs.length;i++){
            for(int j=logs[i][0];j<logs[i][1];j++){
                years[j-1950]++;
            }
        }
        int index=0;
        for(int i=0;i<years.length;i++){
            if(years[i]>max) {
                max = years[i];
                index=i;
            }
        }
        return index+1950;
    }
}