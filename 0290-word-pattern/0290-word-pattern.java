/**
So, hashtable with pattern be key and String s to see the 
While iterating the Array of String words,
if(!charToWord.containsKey(c)) --> if the hashmap doenst contain the key of 
pattern character, add key and value = pattern and a word of S. But before
if the map contains the word from S in this iteration, return false. */
class Solution {
    public boolean wordPattern(String pattern, String s) {
        //split the stringin to array of words
        String[] words = s.split(" ");
        //Check if the number of words = numerber of chars in pattern
        if(words.length != pattern.length())return false;
        //Hash map
        Map<Character, String> charToWord = new HashMap<>();
        //Now iterate through the words and compare
        for(int i=0; i<words.length; i++){
            char c = pattern.charAt(i);
            String word = words[i];
            //Compare the c and word if the hashmap doesnt contain, add
            if(!charToWord.containsKey(c)){
                //if the key is new, word has to be new as well, otherwise, it casn say abba = dog dog dog dog, in other word, key and value should only be uniquely mapped, in this if statement, the it is the newly introduced key, therefore there should not be the word already exists in
                if(charToWord.containsValue(word))return false;
                charToWord.put(c, word);
            }
            //and if the map already contains the key c and the value(wordd)    already contained in the map with the corresponding c  is not equal, return false;
            else if(!charToWord.get(c).equals(word))return false;
        }
        //if everything is okay, return true
        return true;
    }
}