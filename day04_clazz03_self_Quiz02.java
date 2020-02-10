package com.ssafy.java.day04.clazz03.self;
class Bank{
	String name;
	int balance;
	Bank(String name){
		this.name = name;
		this.balance = 10000;
	}
	void makeAccount() {
		System.out.printf("감사합니다. %s 고객님\n생에 첫 가입 축하금 %d원을 고객님의 계좌에 입금하였습니다^_^\n",name,balance);
	}
	int getBalance() {
		return balance;
	}
	void deposit(int num) {
		System.out.printf("%d원이 입금되었습니다.\n",num);
		this.balance+=num;
	}
	void withdraw(int num) {
		if(0<this.balance-num) {
			this.balance-=num;
			System.out.printf("%d원이 출금되었습니다.\n",num);
		}
		else System.out.println("잔액이 부족합니다.");
	}
}
public class Quiz02 {
	public static void main(String[] args) {
		/*
		 	출력결과 > 
		 	
			감사합니다. 홍길동 고객님
			생애 첫 가입 축하금 10000원을 고객님의 계좌에 입금하였습니다.^_^
			현재 잔액 : 10,000원
			1000원이 입금되었습니다.
			입금후 잔액 : 11,000원
			7000원이 출금되었습니다.
			출금후 잔액 : 4,000원
			잔액이 부족합니다.
			출금 실패후 잔액 : 4,000원
		 */
		Bank bank = new Bank("홍길동");
		bank.makeAccount(); // 
		int balance = bank.getBalance();   // 잔액 조회
		System.out.printf("현재 잔액 : %,d원\n", balance);
		
		bank.deposit(1000);  // 1000원 입금
		System.out.printf("입금후 잔액 : %,d원\n", bank.getBalance());
		
		bank.withdraw(7000);  // 7000원 출금
		System.out.printf("출금후 잔액 : %,d원\n", bank.getBalance());
		
		bank.withdraw(7000);  // 7000원 출금
		System.out.printf("출금 실패후 잔액 : %,d원\n", bank.getBalance());
	}
}
