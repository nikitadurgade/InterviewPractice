package Coding_Questions;

public class String_Basics {
	
	public static void main(String[] args) {
		String str="Hello";
		String str2 = "world";
		
		StringBuilder res=  new StringBuilder();
		for(int i=0;i<str.length()||i<str2.length();i++)
		{
			
			
			if(i<str.length())
		res.append(str.charAt(0));
		
		res.append(str2.charAt(0));
	}
		
		System.out.println(res);;
		
		//System.out.println();
	}

}
