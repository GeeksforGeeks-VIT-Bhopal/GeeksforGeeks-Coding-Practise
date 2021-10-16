public class Main
{
  public static void main (String[]args)
  {

    Solution1 object = new Solution1 ();
    int result = object.exactly3Divisors (6);

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
