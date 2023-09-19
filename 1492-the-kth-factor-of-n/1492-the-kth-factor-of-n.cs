public class Solution {
    public int KthFactor(int n, int k) {
        Stack<int> stack = new ();
        int prev = k;
        int count =0;
        int UpperLimit = (int)(Math.Sqrt(n));
        for(int i = 1 ; i <= UpperLimit ; i++)
        {
            if(n%i==0){
                if(++count==prev)
                    return i;
                int next = n/i;
                if(next!=i)
                    stack.Push(next);
                k--;
            }
        }
        try
        {
            while(k!=1)
            {
                int temp = stack.Pop();
                k--;   
            }
        }
        catch
        {
            return - 1  ;
        }

        try
        {
            return stack.Pop();
        }
        catch
        {
            return -1;
        }

               
    }
}