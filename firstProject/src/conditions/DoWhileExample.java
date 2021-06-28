package conditions;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		String name = "";
//		do {
//			System.out.println("이름을 입력 : ");
//			name = scn.nextLine();
//			
//			System.out.println(">>> " + name );
//		}while(!name.equals("quit"));
//		System.out.println("프로그램을 종료.");		
		
		Scanner scn = new Scanner(System.in);
		
		do {
			System.out.println("이름을 입력 : ");
			String name = scn.nextLine();
			if(name.equals("quit")) {
				break;
			}
			System.out.println(">>> " + name );
		}while(false);	
		System.out.println("프로그램을 종료.");			
	}
}
