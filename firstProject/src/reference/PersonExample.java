package reference;

public class PersonExample {
	public static void main(String[] args) {
		Person cyw = new Person();	// 실제 존재를 만드는거 : 인스턴스화 ( 개체 )
		cyw.name = "홍길동";
		cyw.age = 20;
		cyw.height = 167.4;
		cyw.weight = 50;	
//		cyw.birth = "";
		
		cyw.walk();
		cyw.sleep();
		cyw.showInfo();
		
		Person psy = new Person();
		
	}
}
