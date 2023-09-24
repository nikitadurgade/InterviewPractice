package Coding_Questions;

import java.math.BigInteger;
import java.util.Scanner;

//A large number was given as input in the form of string and we had to return its factorial in the form of string.

//Approach: 
/* 1. Convert input string to integer
 * */

public class String_Facorial {

	public static String Calculate_factorial(String input_str) {
		// 1. Convert input string to integer

		try {
			BigInteger n = new BigInteger(input_str);

			// 2. check if n is positive

			if (n.compareTo(BigInteger.ZERO) < 0) {
				return "Factorial can't be defined for negative numbers";
			}

			// 3.Calculate factorial

			BigInteger result = factorial(n);

			return result.toString();

		} catch (NumberFormatException e) {

			System.out.println("Invalid input: eneter positive number");

		}
		return input_str;

	}

	private static BigInteger factorial(BigInteger n) {

		if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
			return BigInteger.ONE;
		}

		else {
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input_str = "5";

		String result = Calculate_factorial(input_str);
		// string_factorial(input_str);
		// string_factorial(str);
		System.out.println("factorial of:" + input_str + ":" + result);

	}

}
