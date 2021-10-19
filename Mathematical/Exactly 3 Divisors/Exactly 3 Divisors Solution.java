import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
	  
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number you want to check ");
    
    int number = scanner.nextInt();
    Solution1 object = new Solution1 ();
    int result = object.exactly3Divisors (number);

    System.out.println (result);
  }
}

class Solution1
{
  public boolean isPrime (int N)
  {

    for (int i = 2; i * i <= N; i++)
      {
	if (N % i == 0)
	  return false;
      }
    return true;


  }
  public int exactly3Divisors (int N)
  {
    int c = 0;
    if (N < 2)
      {
	return c;
      }
    for (int i = 2; i * i <= N; i++)
      {
	if (isPrime (i))
	  {
	    if (i * i <= N)
	      {
		c++;
	      }
	  }
      }
    return c;
  }
}
