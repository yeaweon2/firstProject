package conditions;

import java.util.Scanner;

public class IfExample2 {
	public static void main(String[] args) {
		//사용자의 입력값을 읽어들이는 클래스 Scanner
		//System.in : 키보드 입력값
		Scanner scanner = new Scanner(System.in); 
		System.out.println("숫자를 입력하세요..");
		
		int val = scanner.nextInt();
		System.out.println("입력값 : " + val );
		
		// 홀수인지 짝수인지 구분하는 코드
		if(val % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
	}
}
