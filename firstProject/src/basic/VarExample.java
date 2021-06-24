package basic;

public class VarExample {
	public static void main(String[] args) {
		int kor = 60;
		int eng;
		eng = 71;
		
		int sum = kor + eng;
		System.out.println("두 수의 합 : "+sum);
		
		//		sum = 100;
		
		double avg  = sum/2	 ; //65.5 => 65.0  정수연산은 실수표현안됨. 정수타입으로 나옴
		double avg2 = sum/2.0; //65.5 		   double타입연산은 double타입으로 연산
		
		System.out.println("평 균  : " + avg);
		System.out.println("평 균2 : " + avg2);
		
		System.out.println("두 수의 곱 : " + kor*eng);
		
		double sum1 = 0.2;
	}
}
