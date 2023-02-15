class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count =0;
        for(int i=0;i<operations.length;i++){
            String temp=operations[i];
            if(temp.charAt(0)=='-' || temp.charAt(2)=='-'){
                count--;
            }
            else {
                count++;
            }
            
            
            
        }
        return count;
    }
}