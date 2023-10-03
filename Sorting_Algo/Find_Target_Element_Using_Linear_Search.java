package Sorting_Algo;

public class Find_Target_Element_Using_Linear_Search {
	public static int linear_search(int array[], int target) {
		if (array == null) {
			return -1;
		}
		// find length of array
		int len = array.length;
		int i = 0;
		while (i < len) {
			if (array[i] == target) {
				// System.out.println(array[i]);
				return i;
			} else {
				i = i + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int array[] = { 7, 8, 3, 9,9, 5, 6 };
		// int target= 3;
		System.out.println("index of element 3 is:" + linear_search(array, 3));
		System.out.println("index of element 9 is:"+linear_search(array, 9));
		//System.out.println("index of element 9 is:"+linear_search(array, 9));


	}

}
