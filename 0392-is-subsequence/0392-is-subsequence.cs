public class Solution {
    public bool IsSubsequence(string s, string t) {
        int ptr=0;
        for(int i=0;t.Length>i;i++){
            try{
                char match=s[ptr];
                if(match==t[i]){
                    ptr++;
                    if(ptr==s.Length)
                        return true;
                }
            }
            catch(Exception e){
                break;
            }

        }
        return ptr>= s.Length;
    }
}