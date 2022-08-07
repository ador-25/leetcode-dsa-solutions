class Solution {
    public char repeatedCharacter(String s) {
        int[]map=new int[256];
        for(int i=0;i<s.length();i++){
            if(map[(int)s.charAt(i)]!=0){
                return s.charAt(i);
            }
            map[(int)s.charAt(i)]++;
        }
        return s.charAt(0);
    }
}