package ch01;

class Book {
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {	//제목과 저자가 나오도록 재정의
		return title + ", " + author ;
	}
	
}

public class BookTest {

	public static void main(String[] args) {

		Book book = new Book("데미안", "헤르만 헤세");
		System.out.println(book);
		
		String str = new String("test");
		System.out.println(str);	//toString()이 이미 재정의되어 있기 때문에 문자열이 출력됨(==str.toString())
	}

}
