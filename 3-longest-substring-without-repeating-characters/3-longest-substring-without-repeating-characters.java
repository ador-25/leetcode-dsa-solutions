class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        Set<Character> set = new HashSet<>();
        int slowRunner=0,fastRunner=0;
        while(fastRunner<s.length()){
            if(set.contains(s.charAt(fastRunner))){
                set.remove(s.charAt(slowRunner++));
            }
            if(!set.contains(s.charAt(fastRunner))){
                set.add(s.charAt(fastRunner++));
            }
            max= Math.max(fastRunner-slowRunner,max);
        }
        return max;
    }
}