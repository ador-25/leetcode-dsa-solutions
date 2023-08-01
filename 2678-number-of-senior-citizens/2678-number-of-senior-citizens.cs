public class Solution {
    public int CountSeniors(string[] details) {
        int ageStartIndex =  11;
        int len  = 2;
        int result =0;
        foreach(string item in details){
           string str =  item.Substring(ageStartIndex, len);
           int age =  int.Parse(str);
           result = age>60? result+1: result;
        }
        return result;
    }
}