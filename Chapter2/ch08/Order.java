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
		System.out.println("주문 접수 번호: " + orderNumber
				+ "\n주문 핸드폰 번호: " + phoneNumber
				+ "\n주문 집 주소: " + address
				+ "\n주문 날짜: " + date
				+ "\n주문 시간: " + time
				+ "\n주문 가격: " + price
				+ "\n메뉴 번호: " + menuNumber);
	}

}
