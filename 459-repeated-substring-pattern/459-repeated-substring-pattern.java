class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int size=s.length();
        String temp="";
        for(int i=0;i<size/2;i++){
            temp+=s.charAt(i);
            if(size%temp.length()==0){
                StringBuilder str= new StringBuilder();
                int rep=size/temp.length();
                int count=0;
                while(count<rep) {
                    str.append(temp);
                    count++;
                }
                //System.out.println(str.toString());
                if(str.toString().equals(s))
                    return true;
            }
        }
        return false;
    }
}