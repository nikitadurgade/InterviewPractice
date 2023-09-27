package Coding_Questions;

public class String_Palindrome {
	public static void main(String[] args) {
		String str =  "MADAM";
		String rev = "";
		
		// int len=str.length();
		System.out.println(check_palindrome(str));
	}
	public static String check_palindrome(String str)
	{
		int left =0;
	       int right= str.length()-1;
	        while(left<right)
	        {
	        	if(str.charAt(left)!=str.charAt(right))
	        	{
	        		System.out.println("not palindrome");
	        		return "";
	        	}
	        	left++;
	        	right--;
	        	
	        }
	       return "palindrome";
	//System.out.println("palindrome");
	}
	
}
