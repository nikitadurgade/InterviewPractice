package List_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ArrayList_Example implements Comparator<Student>{
	
	private  List<Student> studentlist;
	

	
	
         public List<Student> getAllStudentdetails()
          {
        	  
        	   return studentlist;
          }
	    

         
         
         
         
         public List<Student> sortStudentDetails()
         {
        	 
         
        	 
        	 return studentlist;
        	 
         }






		@Override
		public int compare(Student s1, Student s2) {
			// TODO Auto-generated method stub
			return Double.compare(s1.getId(), s2.getId());
		}





public static void main(String[] args) {
	
}

}