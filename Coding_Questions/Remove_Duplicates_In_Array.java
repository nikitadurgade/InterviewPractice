package Array_Demo;
//Remove duplicates from array
public class Remove_Duplicates_In_Array {

	public static void main(String[] args) {
		int num[] = { 5, 8, 9, 7, 5 };
		int temp = 0;
		int value = 0;

		// int right=num.length-1;
		// sort array
		int left = 0;
		// print size of array
		System.out.println("size of array:" + num.length);
		// print elements of array
		System.out.println("elements of array:");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			if (i < num.length - 1) {
				System.out.print(" ,");
			}}
		
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					}
				}}
		// print sorted array
		System.out.println("\nsorted array:");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			if (i < num.length - 1) {
				System.out.print(" ,");
			}}
		
		/*
		 * For each element nums[i], check if it is equal to the target value. If
		 * nums[i] is not equal to val, it means it is a non-target element. Set
		 * nums[index] to nums[i] to store the non-target element at the current index
		 * position. Increment index by 1 to move to the next position for the next
		 * non-target element. Continue this process until all elements in the array
		 * have been processed. Finally, return the value of index, which represents the
		 * length of the modified array.
		 */
		System.out.println("\narray after removing duplicates:");
		
		for(int i=0;i<num.length;i++) {
			if(num[i]!=value) {
				num[value]=num[i];
				i++;
				System.out.print(+num[value]);
	
		
			}
			
		}
		}
		}
	
		

	
