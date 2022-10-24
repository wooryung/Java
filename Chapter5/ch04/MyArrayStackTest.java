package ch04;

public class MyArrayStackTest {

	public static void main(String[] args) {

		MyArrayStack stack = new MyArrayStack(3);	//size가 3인 스택 생성
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);	//공간이 없어서 들어가지 못함
		
		stack.printAll();
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}

}
