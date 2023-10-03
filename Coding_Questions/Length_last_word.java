package Coding_Questions;

public class Length_last_word {

	public static int length_of_string(String str)
	{
		String []str1=str.split(" ");
		int len_of_string=0;
		if(str1.length>0)
		{
			len_of_string=str1[str1.length-1].length();
		}
		else
	{len_of_string=0;
	
	}
	 return len_of_string;	
	}
	
	
	
	public static void main(String[] args) {
		String str= "Hello world";
		System.out.println("size of last word of string:"+length_of_string(str));
		String str2 ="Nikita Pune";
		           String str3=str2.trim();
		           System.out.println(str3);
		           
		int x= str2.length()-1;
		System.out.println(x);
		int size_of=0;
		
		
		
}}

