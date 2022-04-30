package StreamAPI;

public class Employee {

	private int empId;
	private String empName;
	private int empMarks;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpMarks() {
		return empMarks;
	}
	public void setEmpMarks(int empMarks) {
		this.empMarks = empMarks;
	}
	public Employee(int empId, String empName, int empMarks) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empMarks = empMarks;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


}
