package List_Interface;

import java.util.ArrayList;
import java.util.List;

public class Student {

	
	private int id;
	private String name;
	private double contact_No;
	public Student(int id, String name, double contact_No) {
		super();
		this.id = id;
		this.name = name;
		this.contact_No = contact_No;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", contact_No=" + contact_No + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getContact_No() {
		return contact_No;
	}
	public void setContact_No(double contact_No) {
		this.contact_No = contact_No;
	}
	
	
	
	
		
	
             
             
             
	
	
}
