class Solution {
public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c!=mat.length*mat[0].length)
            return mat;
        int[]nextElements=new int[mat.length*mat[0].length];
        int counter=0;
        for (int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                nextElements[counter++]=mat[i][j];
            }
        }
        int [][]result= new int[r][c];
        counter=0;
        for(int i =0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++)
                result[i][j]=nextElements[counter++];
        }
        if(counter!=nextElements.length)
            return mat;
        return result;
    }

}