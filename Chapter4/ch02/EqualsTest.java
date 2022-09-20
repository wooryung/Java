package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student std1 = new Student(100, "Lee");
		
		std1.setStudentName("Kim");
		Student copyStudent = (Student)std1.clone();	//생성이 아니라 인스턴스의 상태를 그대로 복제해서 만드는 메서드
		System.out.println(copyStudent);
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(copyStudent));
	}

}
