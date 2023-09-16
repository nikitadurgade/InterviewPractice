package List_Interface;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


public class EmployeeLogic implements Comparator<EmployeeArraylist> {

	@Override
	public int compare(EmployeeArraylist emp1, EmployeeArraylist emp2) {
		
		//return 0;
		return Double.compare(emp1.getSalary(), emp2.getSalary());
	}

	
	
	









}
	
		
		
		
		
		
		
	

