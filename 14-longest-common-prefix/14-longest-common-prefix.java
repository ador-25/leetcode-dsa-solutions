class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb= new StringBuilder();
        int min=Integer.MAX_VALUE;
        for(String t:strs)
            min=Math.min(min,t.length());
        for(int i=0;i<min;i++){
            char temp=strs[0].charAt(i);
            int flag=0;
            for(int j=0;j<(strs.length);j++){
                if(temp!=strs[j].charAt(i)){
                    flag++;
                    break;
                }
            }
            if(flag==1){
                break;
            }
            else{
                sb.append(temp);
            }
        }
        return sb.toString();
    }
}