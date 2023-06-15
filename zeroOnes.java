public class zeroOnes {
    public static int[] leftZeros(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-1; j++){
                while(arr[i] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,0,1,0};
        leftZeros(arr);
    }
}
