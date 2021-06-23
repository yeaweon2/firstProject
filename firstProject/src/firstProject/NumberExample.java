package firstProject;

public class NumberExample {
	public static void main(String[] args) {
		byte math = 30;	// -128 ~ 127
		byte eng = 50;
		
		// 정수연산은 int를 기준으로 함
//		byte sum = math + eng;
//		int sum = math + eng;

		byte sum = (byte)(math + eng);
		
		System.out.println("두 점수의 합 : " + sum);
		
	}
}
