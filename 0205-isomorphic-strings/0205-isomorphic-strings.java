/**
Two strings are isomorphic if they overlap in a way that it does not duplicate
So, it each position or index of the character, each character sould not duplicate. Also, it should have same character in same position, ex) egg ~ add
Use HashMap
Store S in Map and compare. It has to be different 
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
   
        int map1 []=new int[200];
        int map2 []=new int[200];

        for(int i=0; i<s.length(); i++){
              //** in each int array, 0 is assigned by default, so if the character has not been presented before, value for both map1 and map2 should start with 00, but if they are not the same ( 2, 0) the key for 2 has already been presented and 0 is new, therefore below if condition detects and return false. In order to be true, every array has to have int value of index+1  */
            if(map1[s.charAt(i)] != map2[t.charAt(i)])return false;
           // System.out.println("charAt(i)="+s.charAt(i)+" & "+t.charAt(i));
            map1[s.charAt(i)]=i+1;// numer each char starting with 1
            map2[t.charAt(i)]=i+1;
           // System.out.println("after "+map1[s.charAt(i)]+" "+map2[t.charAt(i)]);
        }
        return true;
    }
}
