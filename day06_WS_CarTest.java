package com.ssafy.java.day06.ws;

public class CarTest {
	public static void main(String[] args) {
		CarMgr cm = new CarMgr();
		Car c1 = new Car("12자1234", "BMWmini", 40000000);
		Car c2 = new Car("11자4321", "람보르기니", 390000000);

		Bus b1 = new Bus("23가5642", "전기버스", 20000000, 45);
		Bus b2 = new Bus("22가2977", "등유버스", 19000000, 50);

		Truck t1 = new Truck("31가0423", "포터", 19000000, 8);
		Truck t2 = new Truck("30가8812", "포터", 23000000, 15);

		cm.add(c1);
		cm.add(c2);
		cm.add(b1);
		cm.add(b2);
		cm.add(t1);
		cm.add(t2);

		cm.search();
		Car c = new Car();
		c = cm.search("31가0423");
		if (c == null)
			System.out.println("해당 차량번호와 일치하는 차가 없습니다.");
		else
			System.out.println(c.toString());

		Car[] cararr = cm.search(40000000);
		if (cararr == null)
			System.out.println("해당 차량이 없습니다");
		else {
			for (int i = 0; i < cararr.length; i++) {
				System.out.println(cararr[i].toString());
			}
		}

		cm.update("31가0423", 56000000);
		Car cc = new Car();
		cc = cm.search("31가0423");
		if (cc == null)
			System.out.println("해당 차량번호와 일치하는 차가 없습니다.");
		else
			System.out.println(c.toString());

		cm.delete("11자4321");
		cm.search();

		System.out.println(String.format("관리 배열의 크기 : %d", cm.size()));
		System.out.println(String.format("차량의 총 가격 : %d", cm.totalPrice()));
	}
}
