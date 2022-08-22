class Solution {
    public boolean repeatedSubstringPattern(String s) {
        //kmp approach
        char[] pattern = s.toCharArray();
        int n= s.length();
        int []failures= new int[n];
        int fastRunner=1,slowRunner=0;
        while(fastRunner<n){
         if(pattern[fastRunner]==pattern[slowRunner]){
             failures[fastRunner++]= ++slowRunner;
         }
         else if(slowRunner>0){
             slowRunner=failures[slowRunner-1];
         }
         else{
             fastRunner++;
         }
        }
        if(failures[n-1]==0)
            return false;
        else return(failures[n-1]%(n-failures[n-1])==0);
        
    }
}