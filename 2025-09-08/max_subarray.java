public class max_subarray {
    static int max_sum(int[] arr){
        int sum = arr[0];
        int temp = arr[0];
        for(int i=0;i<arr.length;i++){
            temp = Math.max(arr[i], temp+arr[i]);
            sum = Math.max(sum, temp);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int x = max_sum(arr);
        System.out.println(x);
    }    
}
