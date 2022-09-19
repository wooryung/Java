package ch15;

public interface Queue {

	void enQueue(String title);	//책을 넣음
	String deQueue();	//책을 꺼냄
	
	int getSize();	//큐의 사이즈
}
