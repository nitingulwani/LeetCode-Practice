import java.util.*;

public class spiralMatrix {
    
    public List<Integer> spiralOrder(int[][] matrix){

        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length-1;

        ArrayList<Integer> ans = new ArrayList<>();
        if(matrix.length == 0){
            return ans;
        }

        while(rowBegin <= rowEnd && colBegin <= colEnd){
            // Traverse Right
            for (int j = colBegin; j <= colEnd; j ++) {
                ans.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            
            // Traverse Down
            for (int j = rowBegin; j <= rowEnd; j ++) {
                ans.add(matrix[j][colEnd]);
            }
            colEnd--;
            
            if (rowBegin <= rowEnd) {
                // Traverse Left
                for (int j = colEnd; j >= colBegin; j --) {
                    ans.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            
            if (colBegin <= colEnd) {
                // Traver Up
                for (int j = rowEnd; j >= rowBegin; j --) {
                    ans.add(matrix[j][colBegin]);
                }
            }
            colBegin ++;
        }
        return ans;
    }
}