package reference;

public class ArrayExample6 {
	public static void main(String[] args) {
		// 배열을 선언. 학생의 점수 scores
		// 평균점수와 가장 높은 점수를 구하는 것.
//		int[] scores = { 90, 80, 84 };
		int[] scores = new int[10]; 
		for(int i = 0; i < scores.length ; i++) {
			scores[i] = (int)(Math.random()*100)+1;
		}
		
		int maxValue = 0;
		double avg = 0.0;
		
		for(int i = 0 ; i < scores.length ; i++ ) {
			if(maxValue < scores[i]) {
				maxValue = scores[i];
			}

			avg = avg + scores[i];
			
			System.out.printf("(%2d)", scores[i] );
			if( i%5 == 4 ) {
				System.out.println();
			}
		}
		
		avg = avg / scores.length;

		System.out.println();
		System.out.println("평균은 " + avg );
		System.out.println("최고점수는 " + maxValue );
		
	}
}
