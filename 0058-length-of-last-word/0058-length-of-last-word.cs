public class Solution {
    public int LengthOfLastWord(string s) {
        int count =0;
        for(int i=s.Length-1;i>=0;i--){
            if(s[i]==' '){
                if(count >0)
                    return count; 
                else continue;
            }
            count++;         
        }
        return count;
    }
}