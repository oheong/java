package ssafy.hw200220;

public class CodeNotFoundException extends Exception{
	CodeNotFoundException(){
		System.out.println("상품번호가 존재하지 않습니다!");
	}
}
