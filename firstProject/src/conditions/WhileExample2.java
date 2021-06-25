package conditions;

public class WhileExample2 {
	public static void main(String[] args) {
		while(true) {
			int ran = (int)(Math.random()*3)+1;
			System.out.println("안녕하세요_" + ran);
			if(ran == 3) {
				break;
			}
		}	
		System.out.println("프로그램을 종료.");
	}
}
