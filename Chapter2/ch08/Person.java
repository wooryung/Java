package ch08;

public class Person {
	
	public int height;
	public int weight;
	public String name;
	public int age;
	
	public Person(int height, int weight, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.age = age;
	}
	
	public void showPersonInfo() {
		System.out.println(name + "의 키는 " + height + ", 몸무게는 " + weight + ", 나이는 " + age + "입니다.");
	}

}
