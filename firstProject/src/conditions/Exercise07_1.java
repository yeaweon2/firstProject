package conditions;

import java.util.Scanner;

public class Exercise07_1 {
	public static void main(String[] args) {
		// 간단한 예금처리 프로그램
		int balance = 0;
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("-----------------------");
			System.out.println("1.예금 2.출금 3.잔액 4.종료");
			System.out.println("-----------------------");
			System.out.println("선택>");
			
			int menu = scn.nextInt();
			
			if( menu == 1 ) {
				System.out.println("예금처리");
				System.out.println("금액을 입력>>");
				int temp = scn.nextInt();
				if( (balance+temp) > 100000 ) {
					System.out.println("총 예금액은 10만원을 넘을 수 없습니다.");
				}else {
					balance = balance + temp;	
				}
				System.out.println("현재잔액>> " + balance);
			}else if( menu == 2 ) {
				System.out.println("출금처리");
				System.out.println("금액을 입력>>");
				int temp = scn.nextInt();
				if(balance < temp) {
					System.out.println("출금액이 현재 잔액보다 많습니다.");
				}else {
					balance = balance - temp;
				}
				System.out.println("현재잔액>> " + balance);
			}else if( menu == 3 ) {
				System.out.println("잔액조회처리");
				System.out.println("현재잔액>> " + balance);
			}else if( menu == 4 ) {
				break;
			}
		} // while
		System.out.println("프로그램 종료.");
	}
}
