package ch18;

public class Company {	//�� ȸ���� ��ü�� �����ؾ� �ϹǷ� �ϳ��� �ν��Ͻ��� ����

	private static Company instance = new Company();	//������ ��ü�� ���ο��� ����
	
	private Company() {
		
	}
	
	public static Company getInstance() {	//�ܺο��� �ν��Ͻ��� ����� �� �ֵ���. static���� �����ؾ� �ܺο��� Ŭ���� �̸����� ���� ����
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
