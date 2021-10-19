import java.util.*;

public class Main
{
  public static void main (String[]args)
  {

    Solution2 object = new Solution2();
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the limit of the array");
    int n = scanner.nextInt();
    
    System.out.println("Enter the array Elements");
    
    int arr[] = new int[n];
    
    for(int i=0;i<n;i++){
      arr[i] = scanner.nextInt();
    }
    
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
