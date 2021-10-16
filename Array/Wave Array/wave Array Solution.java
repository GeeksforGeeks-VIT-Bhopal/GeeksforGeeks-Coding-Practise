public class Main
{
  public static void main (String[]args)
  {

    Solution3 object = new Solution3();
    

    int arr[] = {1,2,3,4,5};
    int n = arr.length;
    
    int result[] = object.toWave(arr,n);

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
