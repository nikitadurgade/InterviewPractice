package Coding_Questions;

import java.util.Arrays;
import java.util.stream.Stream;

public class Merge_Two_Strings {
	public static void main(String[] args) {
		
		String str1[]= {"Nikita", "Durgade"};
		String str2[]= {"Pune","Maharashtra"};
		
		System.out.println("Print string 1");
		//System.out.println(str1[]);
		for(int i =0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
		}
		System.out.println("Print string 2");
		//System.out.println(str1[]);
		for(int i =0;i<str2.length;i++)
		{
			System.out.println(str2[i]);
		}
	
		String []merged_string= merge_array(str1,str2);
		//display string
	//	System.out.println(Arrays.toStringmergedarray)));
		
	}

	private static String[] merge_array(String[] str1, String[] str2) {
		// TODO Auto-generated method stub
		int a = str1.length;
		int b= str2.length;
		int merged_lenght= a+b;
		
		String[] mergedarray= new String[merged_lenght];
		//copy from string1[]
		System.arraycopy(str1, 0, mergedarray, 0, a);
		//copy from string[]
		System.arraycopy(str2, 0, mergedarray, 0, b);
		
		return mergedarray;
	}

}
