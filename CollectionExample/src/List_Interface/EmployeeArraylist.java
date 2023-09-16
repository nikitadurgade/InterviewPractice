package List_Interface;

public class EmployeeArraylist {

	
	
     private 	int emp_id;
	 private   String emp_name;
	 private String address;
		private double salary;
		
	 public EmployeeArraylist(int emp_id, String emp_name, String address, double salary) {
			super();
			this.emp_id = emp_id;
			this.emp_name = emp_name;
			this.address = address;
			this.salary = salary;
		}

	
	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
		public String toString() {
			return "EmployeeArraylist [emp_id=" + emp_id + ", emp_name=" + emp_name + ", address=" + address
					+ ", salary=" + salary + "]";
		}

	
	 
	
	 
	 
}
