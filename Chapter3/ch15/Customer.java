package ch15;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
	}

	@Override
	public void order() {	//Sell 인터페이스의 order()를 재정의
		System.out.println("customer order");
	}

	public void hello() {
		System.out.println("hello");
	}

}
