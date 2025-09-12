public class rotation {
    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        int[] res = new int[n];
        for(int i=0;i<n-k;i++){
            res[k+i] = arr[i];
        }
        for(int i=0;i<k;i++){
            res[i] = arr[n-k+i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] res = rotate(arr, 3);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
