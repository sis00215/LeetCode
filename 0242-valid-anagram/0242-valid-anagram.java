/** Anagram - using exacting one char, order doesnt matter 
determine wheter they are injective: one to one 
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        //Check base case
        if(s.length() != t.length())return false;
        Map<Character, Integer> table =new HashMap<>();
        //Stor the frequency of the character of S into the table
        for(char c : s.toCharArray()){
            table.put(c, table.getOrDefault(c,0)+1);
        }
        for(char c : t.toCharArray()){
            //if value of the key is 0, meaning if the key does not exist or it has been used all it could be, return false
            if(table.getOrDefault(c,0)==0)return false;
            //decreament the key value -1, meaning go find a, change the value to -1 of the previous value
            table.put(c, table.get(c)-1);
         }
        return true;


        
        /*//check the base case
        if(s.length()!=t.length())return false;
        //create two arrays of strings to store characters
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        //declare hashmap to store S and T
        Map<Character, Integer> map = new HashMap<>();       
        for(char c : s1){
            map.put(c,0);
        }
        //iterate over and see if you can use the key, once used increment the value to 1. check if you can still use the key with value 0 only. use && for if condition
        for(int i=0; i<t.length(); i++){
            char cT =t1[i];
            if(!map.containsKey(cT)){

                map.put(cT, 1);
            }else return false;
        }return true;
    */
    }
}