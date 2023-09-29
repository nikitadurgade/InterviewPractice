package List_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
public static void main(String[] args) {
	
	
	
	List<EmployeeArraylist>employeelist = new ArrayList<EmployeeArraylist>();
	employeelist.add(new EmployeeArraylist(1, "nikita", "pune", 800000));
	employeelist.add(new EmployeeArraylist(5, "sanket", "pune", 700000));
	employeelist.add(new EmployeeArraylist(6, "swapnil", "baramati", 85555));
	
	Collections.sort(employeelist,new EmployeeLogic());
	System.out.println("employee sorted by salry");
	
	for(EmployeeArraylist emp:employeelist)
	{
		System.out.println(emp);
	}
	
	
}
}
