public class wavePattern {
    static int r = 3;
    static int c = 4;

    public static void printWave(int r, int c, int[][] mat){
        for(int j = 0; j<c; j++){
            if(j%2 == 0){
                for(int i = 0; i<r; i++){
                    System.out.print(mat[i][j] + " ");
                }
            }
            else{
                for(int i = r-1; i>=0; i--){
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        System.out.println("Wave Form: ");
        printWave(r, c, mat);

    }
}
