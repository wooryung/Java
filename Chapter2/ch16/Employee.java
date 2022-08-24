package ch16;

public class Employee {
	
	private static int serialNum = 1000;	//����� ���� ��. �ܺο��� �Ժη� �����ϸ� �� �ǹǷ� private���� ����

	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		serialNum++;	//����� ������ ������ 1�� ����
		employeeId = serialNum;	//��� ������ Ȱ���Ͽ� ��� ����� ���� ����� ���� �ʵ��� ��
	}
	
	public static int getSerialNum() {	//�ܺο��� �Ժη� �����ϸ� �� �ǹǷ� getter�� ����
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
