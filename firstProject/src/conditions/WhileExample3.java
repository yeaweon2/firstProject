package conditions;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("이름을 입력 : ");
			String name = scn.nextLine();
			if(name.equals("quit")) {
				break;
			}
			System.out.println(">>> " + name );
		}	
		System.out.println("프로그램을 종료.");		
	}
}
