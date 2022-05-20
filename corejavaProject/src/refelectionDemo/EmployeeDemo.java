package refelectionDemo;

public class EmployeeDemo {
	
	@MyColumn(name="emp_name")
	private String empName;
	@MyColumn(name="emp_id")
	private int empId;
	@MyColumn(name="emp_salary")
	private int empSalary;
	public EmployeeDemo() {
		
	}
	public EmployeeDemo(String empName, int empId, int empSalary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
	

}
