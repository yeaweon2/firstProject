package conditions;

public class Exercise05 {
	public static void main(String[] args) {
		// 중첩for문을 이용.
		// 방정식 4x + 5y = 60  
		// 모든 해를 구해서 (x , y) 형태로 출력 
		// x와 y는 10이하의 자연수
		for( int x = 1; x <= 10 ; x++ ) {
			for( int y = 1; y <= 10 ; y++ ) {
				if( (4*x)+(5*y) == 60 ) {
					System.out.println("( " + x + " , " + y +" )");
				}
			}
		}
	} // End of main()
} // End of class

