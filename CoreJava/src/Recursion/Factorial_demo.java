package Recursion;

import java.util.Scanner;

/*Algo:
	
	
	factorial(n)
	if n=0
	return  1;
	else
		return n*factorial(n-1)                  //n-1 is modified parameter
		
		
		
		e.g : factorial of 5
		
		step1: factorial(5) 
		  n!= 0 
		  so 
		  return 5*factorail(5-1)       
		  
		  
		  here sysstem don't know fatorail of 4  so it will return 5* ? and then control goes to fatorail of 4 till 1
*/
public class Factorial_demo {

	public static int factorial(int n) {

		if (n == 0) {
			return 1;
		}

		else

			return n * factorial(n - 1);

	}

	public static void main(String[] args) {

		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n * factorial(n - 1));

	}

}
