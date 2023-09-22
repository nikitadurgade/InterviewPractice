package LogicalQuestions;

import java.util.Arrays;

public class Array_demo {

	
	
	public static void main(String[] args) {
		
		
		int arr[] = {45,8,98,32,1};
		int largest =0;
		int second_largest=0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > largest)
            {
                second_largest = largest;
                largest = arr[i];
            }
            else if (arr[i] > second_largest)
            {
                second_largest = arr[i];
            }
        }
        System.out.println("\nSecond largest number is:" + second_largest);
        System.out.println("Largest Number is: "  +largest);

		        //int size = 0 ;

				/*
				 * for(int i =0;i<size;i++) {
				 * 
				 * for(int j=0;j<size;j++) { if (arr[i]>arr[j]) {
				 * 
				 * 
				 * int temp = arr[i]; arr[i]= arr[j]; arr[j]=temp;
				 * 
				 * } }}
				  System.out.println("second largest number is:"+arr[size-1]);*/
		        
		        
		      //  Arrays.sort(arr);
		        
		    //    System.out.println("second largest is"+arr[size-1] );
				 
				 
				 
	
	
	}
}
