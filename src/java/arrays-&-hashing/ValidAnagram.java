
/*
* @Question https://leetcode.com/problems/valid-anagram/
* @Level EASY
*/

public class ValidAnagram {
    // Time Complexity: O(M+N)
    // Space Complexity: O(1)
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] charSet=new int[26];
        for(int i=0;i<s.length();++i){
            charSet[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();++i){
            int idx=t.charAt(i)-'a';
            if(charSet[idx]<=0)
                return false;
            charSet[idx]--;
        }
        for(int i=0;i<26;++i){
            if(charSet[i]>0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //Tests
        ValidAnagram obj=new ValidAnagram();
        System.out.println(obj.isAnagram("anagram", "nagaram"));
        System.out.println(obj.isAnagram("rat", "car"));
    }
}
