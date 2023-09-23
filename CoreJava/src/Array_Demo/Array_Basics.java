package Array_Demo;

import java.util.Scanner;

public class Array_Basics {


	public void insert_into() {

		
		 System.out.println("Enter the element to insert");
		  Scanner sc = new Scanner(System.in);
		  int value = sc.nextInt();
		  System.out.println("Position at which you want to insert element");
		  int position = sc.nextInt();
		  
		  //System.out.println("Array after insering new element:");
		  
		  int size = 0;
		if(position<size)
		  {
			  
		  }
		  
		  
	}

	public static void main(String[] args) {
         int i;
// 		int array[] =null;

		Array_Basics as = new Array_Basics();
		// as.create_array();
		// System.out.println("enter the size of array");
		System.out.println("enter the size of array");

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		// create array of specified array

		int[] array = new int[10];

		// Enter elements of array

		System.out.println("eneter elements of array");

		for ( i = 0; i < size; i++) {
			array[i] = sc.nextInt();

		}

		for (i = 0; i < size; i++) {
			System.out.println("elements of array are:" + array[i]);
		}
		
		
		as.insert_into();
		//System.out.println("Array after insering new element:"+array[i]);

	}
}
