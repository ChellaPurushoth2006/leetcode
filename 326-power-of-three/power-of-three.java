class Solution {
    public boolean isPowerOfThree(int n) {
        int org=n;
        if(n<1)
        return false;
         int x=0;
         while(n%3==0)
        {
            n/=3;
            x++;
        }
        if(Math.pow(3,x)==org)
          return true;
        else
        return false;
    }
}