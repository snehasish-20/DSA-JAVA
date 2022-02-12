/*To check if a string is a palindrome
Time complexity: O(n/2)
Space Complexity: O(n/2)
*/
public class checkPalindrome {
    public static void main(String[] args) {
        String s="madam";
        System.out.println(check(s,0));
    }
    static boolean check(String s,int index)
    {
        if(index>s.length()/2)
         return true;
        if(s.charAt(index)!=s.charAt(s.length()-index-1))
         return false;
        return check(s,index+1);
        
    }
}
