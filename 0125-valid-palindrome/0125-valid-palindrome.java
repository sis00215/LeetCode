class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        //indices for start and last
        int i = 0;
        int j = s.length()-1;
        //Use while loop to simultaneously iterate, while i<=j (doesnt matter the other way)
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;;
            }
            else {
               return false; }
        }
        return true;
    }
}
/*
regex
iterate from the start and last
*/
