package servlet2;

abstract class Bus{
	// 부모는 메소드의 이름을 정한다 -> 추상메소드 형식으로 알려준다
	public abstract void 이동();
}
class 시외버스 extends Bus {
	// 자식은 "상속받은 메소드를 구현한다" (override)
	public void 이동() {
		System.out.println("시외버스로 달려요");
	}
}
class 광역버스 extends Bus {
	// override
	public void 이동() {
		System.out.println("광역버스로 달려요");
	}
}

public class 상속정리 {
	public static void main(String[] args) {
		// 시외버스도 광역버스도 버스 : 부모의 참조변수로 자식을 다룬다
		Bus bus1 = new 시외버스();
		Bus bus2 = new 광역버스();
		
		bus1.이동();
		bus2.이동();
	}
}
