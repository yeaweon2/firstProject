package variable;

public class VarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 30;
		System.out.println(var1);
		
		var1 = 60;
		System.out.println(var1);
		
		long var2 = 100;   // 100L; L은 long형 타입 상수입니다 라고 알려주는 문자
		var2 = 200;
		
		long sub = var1 + var2; // byte, char, short, int, long (byte가 큰타입으로 맞춰줘야함)
		int sub2 = var1 + (int)var2; // byte, char, short, int, long (byte가 큰타입으로 맞춰줘야함)
		System.out.println(sub + " / " +sub2);
		
		String name = "Hong"; 	// " " => 문자열 표현
		char chr = 'A'; 		// ' ' => A가 갖고있는 코드값을 담아놓음.
		chr++;
		chr++;
		System.out.println((int)chr + " / " + chr);
		
	}

}
