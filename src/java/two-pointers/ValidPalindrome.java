/*
* @Question https://leetcode.com/problems/valid-palindrome/
* @Level EASY
*/
public class ValidPalindrome {
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        s=s.toLowerCase();
        while(i<j){
            char chFirst=s.charAt(i);
            char chLast=s.charAt(j);
            if(!Character.isLetterOrDigit(chFirst)){
                i++;
            }
            else if(!Character.isLetterOrDigit(chLast)){
                j--;
            }
            else{
                if(chFirst!=chLast)
                    return false;
                else{
                    i++;
                    j--;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //Tests
        ValidPalindrome obj=new ValidPalindrome();
        System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(obj.isPalindrome("race a car"));
        System.out.println(obj.isPalindrome(" "));
    }
}
