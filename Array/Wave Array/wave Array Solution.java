import java.util.*;

public class Main
{
  public static void main (String[]args)
  {

    Solution3 object = new Solution3();
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the limit of the array");
    int n = scanner.nextInt();
    
    System.out.println("Enter the array Elements");
    
    int arr[] = new int[n];
    
    for(int i=0;i<n;i++){
      arr[i] = scanner.nextInt();
    }

    
    int result[] = object.toWave(arr,n);

    System.out.println("the result is : ");
    for (int i=0;i<n ;i++ ){
        System.out.print(result[i]);
    } 
  }
}

class Solution3{

    

    public int[] toWave(int a[], int n){
  
  
        for(int i=0;i<n-1;i+=2)
        {
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }
        return a;
    }
    
}
