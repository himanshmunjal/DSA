public class palindrome {
    static boolean palindromic(String s){
        s.toLowerCase();
        int end = s.length()-1;
        int start = 0;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Himansh Munjal");
        // // StringBuilder sb_new = new StringBuilder();
        // String sb_new = sb.reverse().toString();
        // if(sb_new.equals(sb)){
        //     System.out.println("It is a Palindrome");
        // }else{
        //     System.out.println("It is not a Palindrome");
        // }
        boolean val = palindromic("naman");
        System.out.println(val);
    }
}
