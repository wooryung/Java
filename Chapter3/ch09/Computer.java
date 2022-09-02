package ch09;

public abstract class Computer {	//추상 클래스는 상속을 위한 클래스

	public abstract void display();	//상속받을 하위 클래스에게 책임을 위임. 상속받는 클래스에 맞게 알아서 구현해라
	public abstract void typing();
	
	void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
