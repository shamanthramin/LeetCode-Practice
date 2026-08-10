class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
       
        int temp = x;
        int rem,reversenum=0;
        while(x>0)
        {
          rem=x%10;
          reversenum=(reversenum*10)+rem  ;
          x=x/10;
            
        }
        return temp==reversenum;
       
        }
    }
