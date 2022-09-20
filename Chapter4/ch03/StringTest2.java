package ch03;

public class StringTest2 {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java));

		java = java.concat(android); //변수 java가 새로 생성된 "javaandroid"라는 메모리의 주소를 가리킴. 기존에 가리키던 "java"는 메모리에 그대로 남아있음

		System.out.println(java);
		System.out.println(System.identityHashCode(java));

	}

}
