 class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i = 0; i<row; i++){
        //     for(int j = 0; j<col; j++){
        //         if(matrix[i][j] == 0){
        //             map.put()
        //         }
        //     }
        // }

        int[] r = new int[row];
        int[] c = new int[col];

        Arrays.fill(r, 1);
        Arrays.fill(c, 1);

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(matrix[i][j] == 0){
                    r[i] = 0;
                    c[j] = 0;
                }
            }
        }

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(r[i] == 0 || c[j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
