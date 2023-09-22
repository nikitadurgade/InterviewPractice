package LogicalQuestions;

import java.util.Scanner;

public class Prime_Number {
	
	
	
	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean isprime=true;
		
		for(int i =2;i<number/2;i++)
		{
			
			 int number1 =number%i;
			 
			 if(number1==0)
			 {
				 isprime=false;
				 break;
			 }
		}
			if(isprime)
			{
				System.out.println("number is prime");
			}
			
			else
			{
				System.out.println("number is not prime");
		}
	}

}
