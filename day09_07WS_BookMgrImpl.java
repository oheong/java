package com.ssafy.java.day02_07WS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookMgrImpl implements IBookMgr {
	// 여기서 구체화하기
	private List<Book> book = new ArrayList<>();
	private FileReader fr;

	// 데이터 입력 기능
	public void inputData(Book b) {
		book.add(b);
	}

	// 데이터 전체 검색 기능
	public List<Book> totalSearch() {
		System.out.println("==========데이터 전체 검색 기능==========");
		return book;
	}

	// 도서가 판매되어 재고 수량을 빼는 기능
	// 예외처리
	public void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException {
		if (book.size() == 0)
			throw new QuantityException();
		else {
			for (int i = 0; i < book.size(); i++) {
				if (book.get(i).getIsbn().equals(isbn)) {
					int temp = book.get(i).getQuantity();
					temp -= quantity;
					if (temp < 0)
						throw new QuantityException();
					else {
						book.get(i).setQuantity(temp);
						return;
					}
				}
			}
			throw new ISBNNotFoundException();
		}
	}

	// 도서가 구매되어 재고 수량을 더하는 기능
	// 예외처리
	public void buy(String isbn, int quantity) throws ISBNNotFoundException {
		if (book.size() == 0)
			throw new ISBNNotFoundException();
		else {
			for (int i = 0; i < book.size(); i++) {
				if (book.get(i).getIsbn().equals(isbn)) {
					int temp = book.get(i).getQuantity();
					temp += quantity;
					book.get(i).setQuantity(temp);
					return;
				}
			}
			throw new ISBNNotFoundException();
		}
	}

	// 재고 도서들의 수량*금액을 하여 총 재고 금액을 구하여 리턴
	public int getTotalAmount() {
		int sum = 0;
		for (int i = 0; i < book.size(); i++) {
			sum += (book.get(i).getPrice()*book.get(i).getQuantity());
		}
		return sum;
	}

	public void open() {
		try {
			fr = new FileReader("book.dat");
			BufferedReader in = new BufferedReader(fr);
			String s;
			while ((s = in.readLine()) != null) {
				String[] temp = s.split("/");
				int tempPrice = Integer.parseInt(temp[2]);
				int tempQuantity = Integer.parseInt(temp[3]);
				if (temp.length == 4) // book
					inputData(new Book(temp[0], temp[1], tempPrice, tempQuantity));

				else {
					int tempMonth = Integer.parseInt(temp[4]);
					inputData(new Magazine(temp[0], temp[1], tempPrice, tempQuantity, tempMonth));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		// TODO Auto-generated method stub
		try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
