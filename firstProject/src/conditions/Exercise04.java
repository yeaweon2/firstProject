package conditions;

public class Exercise04 {
	public static void main(String[] args) {
		// while문와 Math.random() 메소드를 이용
		// 두개의 주사위를 던져 눈의 합이 5이면 Break.
		int ju1 = 0;
		int ju2 = 0;
		int sum = 0;
		
		while(true) {
			ju1 = (int)(Math.random()*6)+1;
			ju2 = (int)(Math.random()*6)+1;
			
			sum = ju1 + ju2;
			System.out.println("주사위 ==> ( " + ju1 + " , " + ju2 + " )");
			
			if(sum == 5) {
				break;
			}
		}
		System.out.println("Break 주사위 ==> ( " + ju1 + " , " + ju2 + " )");
	}
}
