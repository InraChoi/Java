package com.example.day05;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] library2 = new Book[5];
		
		library[0] = new Book("태백산맥","조정래");
		library[1] = new Book("데미안","헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가","유시민");
		library[3] = new Book("토지","박경리");
		library[4] = new Book("어린왕자","생텍쥐페리");
		
		library[1].setBookName("어린왕자");
		library[1].setAuthor("생텍쥐베리");
		for(int i=0; i<library.length; i++) {
//			System.out.println(library[i].getBookName());
			library2[i] = new Book();
			library2[i].setBookName(library[i].getBookName());
			library2[i].setAuthor(library[i].getAuthor());
			library2[i].showBookInfo();
			
		}
	}

}
