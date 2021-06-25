package conditions;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
		// 임의의 수 1, 2, 3을 생성
		// 사용자 값을 입력.. 2 입력
		// 임의의 수와 같은 경우 정답입니다. 다를경우 틀렸습니다.
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("숫자를 입력하세요..");
//		
//		int ran = (int)(Math.random()*3)+1;
//		
//		int val = scanner.nextInt();
//		System.out.println("입력값 : " + val );
//		
//		if(val == ran) {
//			System.out.println("정답입니다.");
//		}else {
//			System.out.println("틀렸습니다.");
//		}
		
//		if(val == 1 || val == 2 || val == 3) {
//			System.out.println("정답입니다.");
//		}else {
//			System.out.println("틀렸습니다.");
//		}
		
//		System.out.println("이름을 입력하세요..");
//		String name = scanner.nextLine();
//		System.out.println("이름은 : " + name);
		
		// 1 : 가위  2 : 바위  3 : 보
		int ran = (int)(Math.random()*3)+1;
		String anyVal = "";
		
		if(ran == 1) 		{ anyVal = "가위"; 	}
		else if(ran == 2) 	{ anyVal = "바위"; 	}
		else if(ran == 3) 	{ anyVal = "보";		}
		
		System.out.println("임의의 수 : " + ran);
		System.out.println("가위바위보 입력해주세요...");
		String str = scanner.nextLine();

		if(str.equals(anyVal)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
	}
}
