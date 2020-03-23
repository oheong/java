import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 어노테이션 선언만 한경우 모든 위치에서 사용가능하다. 
 * 만약, 작성한 어노테이션을 특정 위치에서 사용하게 하고 싶다면 
 * @Target 어노테이션을 이용해서 위치를 제한한다.
 * 
 * @author Oheong
 *
 */
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER}) // type형태에서만 AAA를 사용하게 하고싶어
@interface AAA {
 // @가 있어야 어노테이션이 됨.
}

class BBB {
	void bbb() {}
}

@AAA // TYPE
//@Override
public class AnnoTest01 extends BBB {

	@Override // 메소드에 대한 정보
	void bbb() {
		// ...
	}

	@AAA // FIELD
	private String name;
	
	@AAA // METHOD
	public void call() { }
					// PARAMETER
	public void call(@AAA String name, @AAA int a) { }

	@AAA // METHOD
	public static void main(String[] args) { }
}
