package ch08;

public class Order {
	
	public String orderNumber;
	public String phoneNumber;
	public String address;
	public String date;
	public String time;
	public int price;
	public String menuNumber;
	
	public Order(String orderNumber, String phoneNumber, String address, String date, String time, int price, String menuNumber) {
	
		this.orderNumber = orderNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.date = date;
		this.time = time;
		this.price = price;
		this.menuNumber = menuNumber;
	}
	
	public void showOrderInfo() {
		System.out.println("�ֹ� ���� ��ȣ: " + orderNumber
				+ "\n�ֹ� �ڵ��� ��ȣ: " + phoneNumber
				+ "\n�ֹ� �� �ּ�: " + address
				+ "\n�ֹ� ��¥: " + date
				+ "\n�ֹ� �ð�: " + time
				+ "\n�ֹ� ����: " + price
				+ "\n�޴� ��ȣ: " + menuNumber);
	}

}
