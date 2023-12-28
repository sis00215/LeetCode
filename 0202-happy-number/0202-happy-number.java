class Solution {
    public boolean isHappy(int n) {
        /**2d iteration with while loop. Outer loop will iterate while the hashset.add is true, meaing loop while the n is new to the set. if the n is already present in the set, the hashset.add will return false and break the loop. Inside the loop, another loop to sum the square of all the digits. inside the 2nd loop, and in each iteration, if the total become 1, return true else n = total and store that n into the hashset, going into the another iteation in the outer loop */
    HashSet<Integer> hashSet = new HashSet<>();

    while(hashSet.add(n)){
        int total = 0;
        
        while(n>0){
            //n%10 is the very last digit(1's digit') and you square them and add
            total+= (n%10)*(n%10);
            //delete the last digit for next iteartion
            n/=10;
        }
        if(total==1)return true;
         //it's happy number!!!!
        else n=total;
             //Or store the current total in n and add in the hashset for next iteration
    }
    return false;


    }
}