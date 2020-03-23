import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@interface MyInfo{}

@Target({ElementType.FIELD, ElementType.PARAMETER})
@interface MyName{}
public class AnnoTest02 {
	@MyInfo
	private String name;
	
	@MyName // FIELD
	private String name2;
	
	// 사용이 가능하도록
	public void test(@MyName String name) {}
	
	@MyName // 에러가 발생 (target에 없기때문)
	public void callName() {}
}
