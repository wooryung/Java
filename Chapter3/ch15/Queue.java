package ch15;

public interface Queue {

	void enQueue(String title);	//å�� ����
	String deQueue();	//å�� ����
	
	int getSize();	//ť�� ������
}