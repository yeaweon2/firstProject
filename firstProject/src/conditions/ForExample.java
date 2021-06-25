package conditions;

public class ForExample {
	public static void main(String[] args) {
		// 1 ~ 10 합을 구하는 프로그램.
		int sum = 0;
		
		for(int a = 1 ; a <= 10 ; a++) {
			if( a % 2 == 1 ) {
				sum = sum + a;
				System.out.println("현재 ==> " + a + " / " + sum);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			if(a == 5) {
				break;
			}
			
			
		}
		
		System.out.println(">>> 최종합계 : " + sum);
	}
}
