class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0; //index for s
        //Test for empty strings
        if (s.length()==0 && t.length()>=0)
            return true;
          
        for(int i=0; i<t.length();  i++){
          if(t.charAt(i)==s.charAt(j))
            j++;
          
          if(j == s.length())
          return true;
        }
         return false;
    }
}
 