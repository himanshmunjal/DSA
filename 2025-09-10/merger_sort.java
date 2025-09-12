import java.util.Arrays;

public class merger_sort{
    static void merge(int[] arr, int[] arr1, int[] arr2){
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr[k++] = arr1[i++];
            }else{
                arr[k++] = arr2[j++];
            }
        }

        while(i<arr1.length){
            arr[k++] = arr1[i++];
        }
        while(j<arr2.length){
            arr[k++] = arr2[j++];
        }
    }
    static void sort(int[] arr){
        if(arr.length>1){
            int mid = arr.length/2;

            int[] left = Arrays.copyOfRange(arr,0,mid);
            int[] right = Arrays.copyOfRange(arr,mid, arr.length);

            sort(left);
            sort(right);

            merge(arr, left,right);
        }
    }
    public static void main(String[] args) {
        int[] arr = {23, 11, 2, 24, 32, 12, 10, 21, 7, 27, 17};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}