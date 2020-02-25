package ssafy.hw200220;

public class ProductNotFoundException extends Exception{
	ProductNotFoundException(){
		System.out.println("상품이 존재하지 않습니다!");
	}
}
