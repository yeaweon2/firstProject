package conditions;

import java.util.Scanner;

public class Exercise08 {
	// 필드
	static int balance 	= 0;
	static int money 	= 0;
	static String str 	= "";
	static Scanner scn 	= new Scanner(System.in);
	
	public static void main(String[] args) {
		// 간단한 예금출금 프로그램.
		// while문과 Scanner를 이용
		// 예금, 출금, 조회, 종료 기능구현

		
		boolean run = false;
		String id = "";
		String pass = "";
		
		do {
			if(!run) {
				id = "";
				pass = "";
				
				// id와 pass => admin, 1234
				System.out.println("ID를 입력하세요 =>");
				id = scn.nextLine();
				System.out.println("PASSWORD를 입력하세요 =>");
				pass = scn.nextLine();
				run = checkAdmin(id, pass);
			} else {
				str = "";
				// 메뉴출력
				printMenu();			
				str = scn.next();
				
				if( str.equals("예금") || str.equals("1") ) {
					deposit();
				}else if( str.equals("출금") || str.equals("2")) {
					withdraw();
				}else if( str.equals("잔고") || str.equals("3") ) {
					System.out.println("잔 고 => " + balance + " 원");
				}else if( str.equals("종료")|| str.equals("4") ) {
					run = false;
				}
				System.out.println("");
			}
		} while(run);
		
		System.out.println("프로그램 종료.");
	}
	
	public static boolean checkAdmin(String id, String pass) {
		if(id.equals("admin") && pass.equals("1234")) {
			return true;
		}
		return false;
	}
	
	public static void printMenu() {
		System.out.println("------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("------------------------------");
		System.out.print("선택 ==> ");
	}
	
	public static void deposit() {
		if(balance != 0){
			System.out.println("현재액 => " + balance +" 원 입니다." );
		}
		System.out.print("예금하실 금액을 입력하세요 => ");
		money = scn.nextInt();
		if((balance + money) > 100000 ) {
			System.out.println("총 예금액은 10만원을 넘을 수 없습니다.");
		}else {
			//balance = balance + money;
			balance = add(balance, money);
		}
		System.out.println( "잔 고 => " + balance + " 원");		
	}
	
	public static void withdraw() {
		if( balance > 0 ) {
			System.out.println("현재액 => " + balance +" 원 입니다." );
			System.out.print("출금하실 금액을 입력하세요 => ");
			money = scn.nextInt();
			
			if(balance < money) {
				System.out.println("출금액이 현재 잔액보다 많습니다.");
				System.out.println( "잔 고 => " + balance + " 원");
			}else {
				//balance = balance - money;
				balance = add(balance, -money);
				System.out.println( "잔 고 => " + balance + " 원");	
			}
		}else {
			System.out.println("출금하실 금액이 없습니다.");
		}
	}
	
	public static int add(int balance, int amount) {
		int sum = balance + amount;
		return sum;
	}
	
	
	
}
