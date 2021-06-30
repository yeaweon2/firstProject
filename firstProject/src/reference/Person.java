package reference;

// 현실세계의 사람(Object) => 필드, 메소드
public class Person {
	
	// 필드선언
	int age;		// 나이  속성 필드
	String name;	// 이름
	double height; 	// 키
	double weight;	// 몸무게
	
	// 메소드선언
	void walk() {
		System.out.println("걷습니다.");
	}
	
	void sleep() {
		System.out.println("잠을 잡니다.");
	}
	
	void showInfo() {
		System.out.println("이름은 " + name + "이고 나이는 " + age + "입니다.");
	}
	
	
}
