class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[]map= new int[256];
        for(int i=0;i<s.length();i++){
            map[(int)s.charAt(i)]++;
        }
        for(int i=0;i<t.length();i++){
            if(--map[(int)t.charAt(i)]<0)
                return false;
        }
        for(int i=0;i<map.length;i++)
            if(map[i]!=0)
                return false;
        return true;
    }
}