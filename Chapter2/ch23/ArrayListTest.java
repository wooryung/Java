package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<>();	//ctrl+shift+O를 누르면 import됨
		
		library.add(new Book("태백산맥1", "조정래"));
		library.add(new Book("태백산맥2", "조정래"));
		library.add(new Book("태백산맥3", "조정래"));
		library.add(new Book("태백산맥4", "조정래"));
		library.add(new Book("태백산맥5", "조정래"));
		
		for (int i = 0; i < library.size(); i++) {	//배열의 전체 길이인 length가 아니라 배열에 들어있는 요소의 개수인 size()
			library.get(i).showInfo();
		}
	}

}
