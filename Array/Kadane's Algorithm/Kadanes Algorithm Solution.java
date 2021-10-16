public class Main
{
  public static void main (String[]args)
  {

    Solution2 object = new Solution2();
    
    int arr[] = {1,2,3,-2,5};
    
    int result = object.maxSubArraySum(arr);

      System.out.println (result);
  }
}

class Solution2
{
  int maxSubArraySum(int a[])
    {
        int size = a.length;
        
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}
