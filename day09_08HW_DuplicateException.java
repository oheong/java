package ssafy.hw200220;

public class DuplicateException extends RuntimeException{
	DuplicateException(){
		System.out.println("이미 존재하는 상품입니다!");
	}
}
