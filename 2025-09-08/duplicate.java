// import java.util.ArrayList;
// import java.util.List;

// public class duplicate {
//     static List<Integer> find(int[] arr){
//         int[] freq = new int[arr.length+1];
//         List<Integer> res  = new ArrayList<>();
//         for(int i=0;i<arr.length;i++){
//             freq[arr[i]]++;
//         }
//         for(int i=0;i<freq.length;i++){
//             if(freq[i]>1){
//                 res.add(i);
//             }
//         }
//         return res;

//     }
//     public static void main(String[] args) {
//         int[] arr = {1,3,4,5,2,3,1};
//         List<Integer> res;
//         res = find(arr);
//         System.out.println(res);
//     }
// }

import java.util.ArrayList;

class duplicate {

    public static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int idx = Math.abs(arr[i]) - 1;
            if (arr[idx] < 0) {  //
                ans.add(Math.abs(arr[i]));
            } else { 
                arr[idx] = -arr[idx]; 
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3};
        ArrayList<Integer> res = findDuplicates(arr);
        for (int ele : res) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
