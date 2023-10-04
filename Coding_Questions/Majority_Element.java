package Coding_Questions;

import java.lang.reflect.Array;

public class Majority_Element {
	static void find_majority_Element(int array[],int l)
 {  
	  int maxcount=0;
	  int index=-1;
	 for(int i=0;i<l; i++) {
		 int count=0;
		 for(int j=0;j<l;j++) {
		 if(array[i]==array[j])
			 count++;
	 }
	 if(count>maxcount)
	 {
		 maxcount=count;
		 index=i;
	 }
	 }
	 if(maxcount>l/2)
	 {
		 System.out.println(array[index]);
	 }
	 else
	 {
		 System.out.println("no majority element");
	 }
 }

	public static void main(String[] args) {
		//int array[] = { 1, 2, 5, 5, 7, 6,5,5 };
        int array[] = { 1, 1, 2, 1, 3, 5, 1 };

		int l = array.length;
		find_majority_Element(array, l);

	}
}
