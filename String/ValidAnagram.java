// https://leetcode.com/problems/valid-anagram/submissions/1891824743/
import java.util.Arrays;


//Brute force approach 
class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray,tArray);
    }
}

//Frequency counter strategy
class newApproach {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int count[] = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i) -'a']++;
            count[t.charAt(i) -'a']--;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;

        
    }
}

