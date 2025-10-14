class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";

        Arrays.sort(strs);  //EG:toy tap tom
                            //tap tom toy (first and last String only should compare)
        String first=strs[0];
        String last=strs[strs.length-1];
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==last.charAt(i)){
            ans+=first.charAt(i);
            }
            else{
                break;
            }
        }
        return ans;
    }
}