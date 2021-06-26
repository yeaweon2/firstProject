package conditions;

public class Exercise03 {

	public static void main(String[] args) {
		// for문을 이용하여 1~100까지의 정수 
		// 3의 배수의 총합을 구하는 코드 작성
		int sum = 0;
		for(int i = 1; i<= 100; i++) {
			if(i%3==0) {
				sum = sum +i;
			}
		}
		System.out.println("3의 배수의 합 : " + sum);
	}

}
