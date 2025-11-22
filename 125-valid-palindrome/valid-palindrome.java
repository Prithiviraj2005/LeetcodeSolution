class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))||Character.isDigit(s.charAt(i))){
                s1.append(s.charAt(i));
            }
        }
        String n=s1.toString();
        String rev=s1.reverse().toString();

        if(n.equals(rev))
        {
            return true;
        }
        return false;
    }
}