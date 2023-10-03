package Coding_Questions;

import java.util.Arrays;

public class Merge_Array {

	public static void main(String[] args) {
		int num1[] = { 1, 2, 3, 0, 0, 0 };
		int num2[] = { 2, 5, 6 };

		int m = num1.length;
		int n = num2.length;
		System.out.println("Size of array1 is:" + m);
        System.out.println("elments of array 1:");
		for (int i = 0; i < m; i++) {
			System.out.println(num1[i]);
		}
		System.out.println("Size of array2 is:" + n);
		System.out.println("Elements of array 2 is");
		for (int i = 0; i < n; i++) {
			System.out.println(num2[i]);
		}

		int x= m+n;
		//create new array
		int [] num3= new int[x];
		//copy elemnets from array1 to array3
		
		
		for(int i=0;i<m;i++)
		{
            num3[i]=num1[i];			
		}
		
		//copy elements of array 2 in array 3
		for(int i=0;i<n;i++)
		{
            num3[m + i]=num2[i];			
		}
		
		System.out.println("printed array");
		for(int i=0;i<num3.length;i++)
		{
			//num3[i];
			System.out.print( num3 [i]);
			//Arrays.asList(num3[i]);
		}
	}
}
