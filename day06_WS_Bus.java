package com.ssafy.java.day06.ws;

public class Bus extends Car {
	private int seat;

	Bus() {

	}

	public Bus(String num, String model, int price, int seat) {
		super(num, model, price);
		this.seat = seat;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
	public String toString() {
		return String.format("num : %s\tmodel : %s\tprice : %d\tton : %d", super.getNum(), super.getModel(),
				super.getPrice(), getSeat());
	}
}
