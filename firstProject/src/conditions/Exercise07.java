package conditions;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		// 간단한 예금출금 프로그램.
		// while문과 Scanner를 이용
		// 예금, 출금, 조회, 종료 기능구현
		int balance = 0;
		int money = 0;
		String str = "";
		Scanner scn = new Scanner(System.in);
		while(true) {
			 	
			str = ""; 
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택 ==> ");
			str = scn.next();
			
			if( str.equals("예금") || str.equals("1") ) {
				if(balance != 0){
					System.out.println("현재액 => " + balance +" 원 입니다." );
				}
				System.out.print("예금하실 금액을 입력하세요 => ");
				money = scn.nextInt();
				if((balance + money) > 100000 ) {
					System.out.println("총 예금액은 10만원을 넘을 수 없습니다.");
				}else {
					balance = balance + money;
				}
				
				System.out.println( "잔 고 =>" + balance + " 원");
				
			}else if( str.equals("출금") || str.equals("2")) {
				if( balance > 0) {
					System.out.println("현재액 => " + balance +" 원 입니다." );
					System.out.print("출금하실 금액을 입력하세요 => ");
					money = scn.nextInt();
					
					if(balance < money) {
						System.out.println("출금액이 현재 잔액보다 많습니다.");
						System.out.println( "잔 고 =>" + balance + " 원");
					}else {
						balance = balance - money;
						System.out.println( "잔 고 =>" + balance + " 원");	
					}
				}else {
					System.out.println("출금하실 금액이 없습니다.");
				}
			}else if( str.equals("잔고") || str.equals("3") ) {
				System.out.println("잔 고 => " + balance + " 원");
			}else if( str.equals("종료")|| str.equals("4") ) {
				break;
			}
			System.out.println("");
		}
		System.out.println("프로그램 종료.");
	}
}
