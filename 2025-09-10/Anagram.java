public class Anagram {
    static boolean isanagram(String s1, String s2){
        s1 = s1.toLowerCase();s2 = s2.toLowerCase();
        if(s1.length()!=s2.length()){
            return false;
        }else{
            int[] freq = new int[26];
            for(int i=0;i<s1.length();i++){
                freq[s1.charAt(i) - 'a']++;
            }
            for(int i=0;i<s2.length();i++){
                freq[s2.charAt(i) - 'a']--;
            }

            for(int count:freq){
                if(count!=0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "Himansh";
        String s2 = "mansiHH";
        System.out.println(isanagram(s1, s2));
    }    
}
