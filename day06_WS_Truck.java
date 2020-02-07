package com.ssafy.java.day06.ws;

public class Truck extends Car {
	private int ton;

	Truck() {

	}

	public Truck(String num, String model, int price, int ton) {
		super(num, model, price);
		this.ton = ton;
	}

	public int getTon() {
		return ton;
	}

	public void setTon(int ton) {
		this.ton = ton;
	}

	public String toString() {
		return String.format("num : %s\tmodel : %s\tprice : %d\tton : %d", super.getNum(), super.getModel(),
				super.getPrice(), getTon());
	}
}
