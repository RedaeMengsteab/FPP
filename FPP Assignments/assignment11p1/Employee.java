package assignment11p1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class Employee {
	private String firstName;
	private String lastName;
//	private HashMap salaryRecord;
	private HashMap <String,Double>salaryRecord;
	Employee(){
		salaryRecord=new HashMap<>();
	}
	public void addEntry(String date,double salary) {
		salaryRecord.put(date,salary);
	}
	public void printPaymentAmount(String date) {
		String payment = " did not receive a paycheck";
		if (salaryRecord.get(date) != null) {
			payment = " was paid " + salaryRecord.get(date);
		}

		System.out.println(firstName + " " + lastName + payment + " on " + date);
	}
	public void printAveragePaycheck() {
		double sum=0.0;
		double ave=0.0;
		for(Map.Entry<String,Double>e:salaryRecord.entrySet())
		{
			sum+=e.getValue();
		}
		System.out.println("Average paycheck for " + firstName + " " + lastName + " was " + (sum/salaryRecord.size()));
		

	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for(int i = 1; i <= 12; ++i) {
			e.addEntry(i+"/15/2011", 3070+5*i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
