package Recursion;

//Fibonacci series is series whrere each number is sum of proceeding two numbers
//first two numbers are always 0 n 1 
// e.g: 0,1,1,2,3,5,7...

 //Algorithum :

  //S1:   fib(n)
  
/*  S2:  As first two numbers must be 0 n 1 so 
  if n<1;
  return error;
  
   else if n== 1 || 2 
		   return n-1;
  
   else
	   return 
			   fib(n-1)+fib(n-2)
	  
*/


public class Fibonaci_Series {
	
	
	
	public static int fibonacci_series(int n)
	{
		
		
		if (n<=1)
		{
			return n;
		}
		
		/*
		 * else if(n==1 || n==2) { return n-1; }
		 */
		else 
		{
			return fibonacci_series(n-1)+ fibonacci_series(n-2);
	}

}
	
	
	  public static void main(String[] args) 
	  {
		
		  int n=10;
		  int calculate_fibonacii= fibonacci_series(n);
		  //System.out.println("fibonaci series is :"+calculate_fibonacii);
		  for (int i = 0; i < n; i++) {
	            System.out.print(fibonacci_series(i) + " ");
	        }
	}
}
