class Solution {
public boolean repeatedSubstringPattern(String s) {
        //start taking substrings from beginning
        //check if rest of the string follows the pattern
        //check only if divisible
        //n^2

        int size=s.length();
        for(int i=1;i<size;i++){
            if(size%i==0){
                if(stringMatchingHelper(s,s.substring(0,i)))
                    return true;
            }
        }
        return false;
    }
    private boolean stringMatchingHelper(String str,String temp){
        return str.replace(temp,"").length()==0;
    }
}