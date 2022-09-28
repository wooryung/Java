package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student std1 = new Student(100, "Lee");
		
		std1.setStudentName("Kim");
		Student copyStudent = (Student)std1.clone();	//������ �ƴ϶� �ν��Ͻ��� ���¸� �״�� �����ؼ� ����� �޼���
		System.out.println(copyStudent);
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(copyStudent));
	}

}
