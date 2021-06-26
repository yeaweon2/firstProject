package conditions;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		// while문과 Scanner를 이용
		// 예금, 출금, 조회, 종료 기능구현
		boolean run = true;
		int balance = 0;
		int money = 0;
		
		while(true) {
			Scanner scn = new Scanner(System.in);
			String str = ""; 
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택 ==> ");
			str = scn.nextLine();
			
			if( str.equals("예금") ) {
				System.out.println("현재액 => " + balance +" 원 입니다." );
				System.out.println("예금하실 금액을 입력하세요 => ");
				money = scn.nextInt();
				balance = balance + money;
				System.out.println( "잔 고 =>" + balance + " 원");
				
			}else if( str.equals("출금") ) {
				System.out.println("현재액 => " + balance +" 원 입니다." );
				System.out.println("출금하실 금액을 입력하세요 => ");
				money = scn.nextInt();
				balance = balance - money;
				System.out.println( "잔 고 =>" + balance + " 원");
			}else if( str.equals("잔고") ) {
				System.out.println("잔 고 => " + balance + " 원");
			}else if( str.equals("종료") ) {
				break;
			}
			System.out.println("");
		}
		System.out.println("프로그램 종료.");
	}
}
