class Solution {
    public boolean repeatedSubstringPattern(String s) {
        //without loop approach
        String newString= (s+s).substring(1,s.length()*2-1);
        if(newString.contains(s))
            return true;
        return false;

    }
}