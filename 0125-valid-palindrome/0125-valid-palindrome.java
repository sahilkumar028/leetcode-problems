class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb=new StringBuilder(s);
        sb.reverse().toString();
        if(s.equalsIgnoreCase(sb.toString())){
            return true;
        }
        return false;
        
    }
}