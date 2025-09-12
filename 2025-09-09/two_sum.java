import java.util.HashSet;

public class two_sum {
    static HashSet<Integer> sum(int[] arr, int target){
        HashSet<Integer> seen= new HashSet<>();  
        for(int i=0;i<arr.length;i++){
            int val = target - arr[i];
            if(seen.contains(val)){
                HashSet<Integer> res= new HashSet<>();  
                res.add(arr[i]);
                res.add(val);
                return res;
            }
            seen.add(arr[i]);
        }
        return new HashSet<>();
    }
    public static void main(String[] args) {
        int[] arr = {23,12,2,5,11,1,7};
        HashSet<Integer> ans = new HashSet<>();
        ans = sum(arr,19);
        System.out.println(ans);
    }
}
