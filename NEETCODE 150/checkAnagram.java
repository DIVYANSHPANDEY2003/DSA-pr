public class checkAnagram {

    // ********OPTIMAL SOLUTION***********
    public static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        int [] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int cnt:count){
            if(cnt!=0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        if(isAnagram(str1,str2)){
            System.out.println(str1+ " and " +str2+ " are anagram ");
        }
        else{
            System.out.println(str1+ " and " +str2+ " are not anagram ");
        }

    }
}
