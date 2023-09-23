package Array_Demo;

public class Array_Operations {
	

		
		//	Create Array 
	
	
		
		//int array[] = {10,50,69,9,36};
	
	
	      int arr[]=null;

	      //array creation with help of constructor
		public Array_Operations(int size_of_array) 
		{
			arr= new int[size_of_array];
			for(int i=0; i<arr.length;  i++)
				arr[i]= Integer.MIN_VALUE;
			
		}
		
		
  //Traverse array or print array
		
		//TRAVERS THROUGH ARRAY 
		/*
		 * Traverse_array(array) 
		 * loop: i to array.length 
		 * print array[i]
		 */	

		
		public void traverse_array()
		{
			
			try
			{
			for(int i =0; i<arr.length ;i++)
			{
				System.out.println("Given array is "+arr[i]);
			}
		}
			catch (Exception e) 
			{
				// TODO: handle exception
				System.out.println("Array doesn't exist ");
			}
	      
		
		}
		
		
		
		
		
		
		 //INSERT_VALUE IN ARRAY 
		
		/*
		 * Insert value in array insert(array,value_to_be_inserted,location)
		 * if(array[location] is occupied ) return error already occupied else
		 * array[location]= value to be inserted
		 */	
		
	
		
		public void insert_value( int location, int value_to_insert )
		{
			
			try
			{
				if (arr[location]==Integer.MIN_VALUE )
				{
					
					arr[location]= value_to_insert;
					System.out.println("value inserted succesfully: "+ value_to_insert+"  at location"+ location);
				}
				
				else
				{
					System.out.println("cell is already occupied by another value");
				}
			}
			catch (ArrayIndexOutOfBoundsException ex) {
				// TODO: handle exception
				
				System.out.println("Invalid index or size is less  ");
				//ex.printStackTrace();
			}
			
		
		
		
		}
		
		
		// ACESSING PARTICULAR ELEMENT 
		
		/*
		 * Acessing_Cell_No(array,Cell_Number) 
		 * if(Cell_Number>array[size]) 
		 * return exception 
		 * else 
		 * return array[Cell_number]
		 */
		
		public void access_Element(int cell_number)
		{
			try
			{
				System.out.println(arr[cell_number]);
				
			}
/*			if (location > arr[i])
			{
				System.out.println();
			}
*/			catch(ArrayIndexOutOfBoundsException ex)
			{
	
	       System.out.println("Invalid input");
			}
			
		}
		
		
		
		
		
		//SEARCHING GIVEN VALUE IN ARRAY
		
		/*
		 * Search_Array(array, Value_to_Search) 
		 * for(i=0 to array.length)
		 * 
		 * if (array[i]==Value_to_Search) 
		 * return i;  (i is cell no here)
		 *  else 
		 *  notfound
		 */	
		
	
		public void Search_element(int value_to_search)
		{
			for(int i=0; i<arr.length ;i++)
			{
				if(arr[i]==value_to_search)
				{
				System.out.println("value found");
				System.out.println("index of value is :" +value_to_search+ "is found at index :"+i);
				return;
				}
				else
					System.out.println("value not found");
			}
		}
	
	
		//DELETION OF VALUE IN ARRAY
		/*
		 * In array we can't delete value or we can't keep cell_no blank so we use Interger.MIN_VALUE to replace it with value to be deleted
		 * 
		 * e.g [1,2,4,8,9]
		 * if we want to delete value at index 2 i.e 4 , 4 will get deleted and it will be replaced by -2^31
		 * Deleting_value(array,location)    location  is cell no
		 * 
		 * if(array[location] is occupied)
		 * 
		 * array[location]=Integer.MIN_VALUE(-2 ^31); 
		 * 
		 * else location is occupied
		 */
	
		
		public void delete_Element(int value_to_delete_from_cell)
		{
			
			try
			{
				
				arr[value_to_delete_from_cell]=Integer.MIN_VALUE;
				
				


		}
			catch (ArrayIndexOutOfBoundsException ex) {
				// TODO: handle exception
				System.out.println();
				System.out.println("can't perform delete operation");
			}
	}


}