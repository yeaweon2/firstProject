package conditions;

public class ForExample4 {
	public static void main(String[] args) {
		whileSum();
		forSum();
	}
	
	public static void whileSum() {
		int i = 1;
		int sum = 0;
		while(i<=10) {
			if( i%2 == 0 ) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("[while문] 1 ~ 10 중 짝수의 합계 ==> " + sum );		
	}
	
	public static void forSum() {
		// 1부터 10까지 i 변수 활용.
		// int sum 합계
		int sum = 0;
		for(int i=1 ; i <=10 ; i++) {
			if( i%2 != 0 ) {
				sum = sum+i;	
				System.out.println("sum ==> " + sum + " , i ==> " + i);
			}
		}
		System.out.println("[for문] 1 ~ 10 중 홀수의 합계 ==> " + sum );		
	}
}
