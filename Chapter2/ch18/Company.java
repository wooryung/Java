package ch18;

public class Company {	//한 회사의 객체는 유일해야 하므로 하나의 인스턴스만 생성

	private static Company instance = new Company();	//유일한 객체를 내부에서 생성
	
	private Company() {
		
	}
	
	public static Company getInstance() {	//외부에서 인스턴스를 사용할 수 있도록. static으로 설정해야 외부에서 클래스 이름으로 참조 가능
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
