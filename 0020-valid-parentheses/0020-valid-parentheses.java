/**Stack problem,  1 array and 1 stack pop and check. while there is soemthing remain, pop one and check the first one and after with index
       you dont have to use arraylist if you just interate the string and check*/ 

class Solution {
    public boolean isValid(String s) {
        //Base case
        //if(s.length()%2 !=0) return false;
       
   char[] charArray = s.toCharArray();
   Stack<Character> stack = new Stack<>();
  
    //iterate over the charArray check only the open brackets, and push in corresponding closing brackets
    for(char c : charArray){
       
        if(c == '(') stack.push(')');
        else if(c == '{') stack.push('}');
        else if(c == '[') stack.push(']');
        //in case of encountering closing bracket: if stack is empty(empty string), one that encountered,c, != pop -> return false;
        
        else if(stack.isEmpty() || stack.pop()!= c)return false;
       // System.out.println("c = "+c+"stack = "+stack);
         
    } return stack.isEmpty();
    //if the stack is empty, it means all the corresponding closing brackets have been used. if it is not empty, means not matched properly
    }
}