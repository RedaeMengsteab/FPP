package assignment4p1;
import java.time.LocalDate;

public class DeptEmployee {
	private String name;
	private double salary;
	private LocalDate hireDate;
	public DeptEmployee (String name,LocalDate hireDate,double salary)
	{
		this.name=name;
		this.salary=salary;
		this.hireDate=hireDate;
		
	}
	public double computeSalary()
	{
		return salary;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setHiredate(LocalDate hireDate)
	{
		this.hireDate=hireDate;
		
	}
	public LocalDate getHireDate()
	{
		return hireDate;
		
		
	}

}
