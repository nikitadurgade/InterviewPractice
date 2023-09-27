package Coding_Questions;

import string_Examples.string_demo;

//GCD OF STRING 
/*For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
*/
/*Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

Example 2:
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"

Example 3:
Input: str1 = "LEET", str2 = "CODE"
Output: ""
*/
public class String_Divisior {

	static String gcd_of_String(String string1, String string2)

	{
		// check if string 1 < string 2
		// if yes swap them

		if (string1.length() < string2.length())
		{
			String temp = string1;
			string1 = string2;
			string2 = temp;

		}
		/*
		 * else { System.out.println("GCD"); }
		 */
		// check string1 isnot  concatenation of string2
		else if (!string1.startsWith(string2)) 
		{
			/*String remainder = string1.substring(string2.length());
			return gcd_of_String(remainder, string2);*/
			return " ";

		}
		// if string2 is empty then string1 is gcd
		else if (string2.isEmpty()) {
 //GCD String is found
			return string1;
		}

		else {
			return gcd_of_String(string1.substring(string2.length()), string2);
		
	}
		return string2;

		 
	}
	static String findgcd(String[] array,int n)
	{
        String result = array[0];
        
        for (int i = 1; i < n; i++) {
            result = gcd_of_String(result, array[i]);
        }
 
        // Return the GCD of strings
        return result;

	}

	
	
	
	// string1 is divisible by 2 if string 2 is concatenatd with itsel more thn one
	public static void main(String[] args) {
		/*
		 * String string1 = "ABCABC"; String string2 = "ABC"; String gcd =
		 * gcd_of_String(string1, string2);
		 */
		/*
		 * if (gcd.isEmpty()) { System.out.println("there is no gcd"); } else {
		 * System.out.println("GCD IS:" + gcd); }
		 */	// if(gcd_of_String(string1, string2))
		
		
        String array[]
                = new String[] { "GFGGFG",
                                 "GFGGFG",
                                 "GFGGFGGFGGFG" };
            int n = array.length;
     
            // Function Call
            System.out.println(findgcd(array, n));

	}}


