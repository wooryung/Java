package ch16;

public class Employee {
	
	private static int serialNum = 1000;	//사번의 기준 값. 외부에서 함부로 변경하면 안 되므로 private으로 설정

	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		serialNum++;	//사번이 생성될 때마다 1씩 증가
		employeeId = serialNum;	//멤버 변수를 활용하여 모든 사원이 같은 사번을 갖지 않도록 함
	}
	
	public static int getSerialNum() {	//외부에서 함부로 변경하면 안 되므로 getter만 제공
		return serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
