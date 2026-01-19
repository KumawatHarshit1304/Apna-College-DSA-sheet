// https://leetcode.com/problems/valid-palindrome/
class ValidPalindrome{
    public boolean Palindrome(String s){
        // Pointers for checking characters
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            // checking whether pointer is pointing towards valid character 
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            //Now checking left and right pointer character whether they are same or not and also converting them into lowecase
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++;
            right--;
            
        }
        return true;
    }

}