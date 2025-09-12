public class trapping_water {
    static int water(int[] arr){
        int n = arr.length;
        int left = 1;
        int right = n-2;
        int lmax = arr[left-1];
        int rmax = arr[right+1];
        int res = 0;
        while(left<=right){
            if(rmax<=lmax){
                res += Math.max(rmax-arr[right], 0);
                rmax = Math.max(rmax, arr[right]);
                right--;
            }else{
                res +=Math.max(lmax-arr[left],0) ;
                lmax = Math.max(lmax, arr[left]);
                left++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,6,2,1,9,5};
        int res = water(arr);
        System.out.println(res);
    }
}