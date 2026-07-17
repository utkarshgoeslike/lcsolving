class Solution {
    public boolean isPalindrome(String s) {
        boolean isEqual =true;
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] ch =s.toCharArray();
        int left =0 ;
        int right=ch.length-1;
        while(left<=right){
            if(ch[left]!=ch[right]){
                isEqual= false;
            }
            left++;
            right--;
        }
        return isEqual;
    }
}