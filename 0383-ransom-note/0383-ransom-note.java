class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //Check for the basic conditionfor ransomNote
        if(ransomNote.length()>magazine.length())return false;
        
        //Declare Hashmap
        Map<Character, Integer> hash = new HashMap();
        //iterate over magazine
        for(int i=0; i<magazine.length(); i++){
            char word = magazine.charAt(i);
            hash.put(word, hash.getOrDefault(word, 0)+1);
        }
        //iterate over ransomNote
        for(int i=0; i<ransomNote.length(); i++){
            char word = ransomNote.charAt(i);
            hash.put(word, hash.getOrDefault(word, 0)-1);
            
        }//if the word is present in the map, detuct the count by 1
        //iterate over hashmap
        for(Map.Entry<Character, Integer> entry: hash.entrySet()){
            System.out.println("key="+ entry.getKey() +" "+ "value= "+entry.getValue());
            //if value is negative return false
            if(entry.getValue()<0)return false;
        }
        return true;
    }
    }
    //ArrayList method
       /*List<Character> mag = new ArrayList<>();
        int k=0;
        //store each char in magazine into the mag list
        for(int i=0; i<magazine.length(); i++){
            mag.add(magazine.charAt(i));
        }
       
      // System.out.println("mag="+mag);
       //iterate through mag = aab
       //                ran = aa
      // System.out.println("length of ransome= "+ransomNote.length());
       for(int i=0; i<ransomNote.length(); i++){    
        for(int j=0; j<mag.size(); j++){
            if(ransomNote.charAt(i)==mag.get(j)){
                k++;
                mag.remove(j);
                break; 
            } 
          }
        }
         if(k==ransomNote.length()){
              return true;
       }
       return false;
    }}*/

      
      /* for(int i=0; i<mag.size(); i++){
        if(mag.get(i).equals(ransomNote.charAt(j))){
            
            j++;
            mag.remove(mag.get(i)); 
            
           i=0;  
           System.out.println("i inside if = "+i);
        }
        System.out.println("Current i = "+i);
        System.out.println("j="+j);
       }
        
       if(j==ransomNote.length()) return true;
       else return false;
    }}
    */

       
       
       
       
       
        /*int j = 0;

        for(int i=0; i<magazine.length(); i++){
            
            if(magazine.charAt(i) == ransomNote.charAt(j)){
                j++;
            }
            if(j == ransomNote.length())
            return true;
    
        }return false;
    }
    */



/**
similar to needle and haystack question
ransomNOte = needle
magazine = haystack
return boolean value
** Order doesnt matter - has to come up with different variation 
so has to take out the a char of needle from hay
remove method in array?
create an array list (not efficient)
 */