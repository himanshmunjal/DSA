import java.util.Arrays;

public class reversing {
    static void sort(int[] arr){
        // int start = 0;
        // int end = arr.length-1;
        // while(start<end){
        //     int temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;
        //     start++;end--;
        // }
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
    public static void main(String[] args) {
        int[]arr = {1,4,3,2,6,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
