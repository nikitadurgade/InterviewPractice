package Array_Demo;

public class Array_Main {
	public static void main(String[] args) {
		
		System.out.println("creating   array of size 5");
		
		Array_Operations as = new Array_Operations(5);
		System.out.println("Traversing through array");
		as.traverse_array();
		
		System.out.println("inserting value in array");
		as.insert_value(0, 10);
		as.insert_value(1, 89);
		as.insert_value(2, 65);
		as.insert_value(3, 98);
		as.insert_value(4, 69);
		as.insert_value(6, 36);
		as.insert_value(1, 200);
		
		
		System.out.println("Accessing element in array");
		as.access_Element(1);
	    as.access_Element(10);
		
	    
	    System.out.println("Searching element i array");
	    as.Search_element(69);
	   // as.Search_element(400);
	    
	    System.out.println("deleting value from array ");
	    System.out.println("array before deletion");
	    as.traverse_array();
	    as.delete_Element(3);
	    System.out.println("Array after deletion");
	    as.traverse_array();
	    System.out.println();
	}

}
