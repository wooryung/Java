package ch09;

public abstract class Computer {	//�߻� Ŭ������ ����� ���� Ŭ����

	public abstract void display();	//��ӹ��� ���� Ŭ�������� å���� ����. ��ӹ޴� Ŭ������ �°� �˾Ƽ� �����ض�
	public abstract void typing();
	
	void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
