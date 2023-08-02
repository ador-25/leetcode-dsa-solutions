public class Solution {
    public int MostWordsFound(string[] sentences) {
        int max =int.MinValue;
        foreach(string sentence in sentences){
            int curr=1;
            for(int i=0;i<sentence.Length;i++){
                if(sentence[i]==' '){
                    curr++;
                }
            }
            max= curr>max? curr:max;
        }
        return max;
    }
}