package reference;

import java.util.Scanner;

public class ArrayExample5 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String[] names = new String[5];
		names[0] = "Hong";
		names[1] = "Hwang";
		names[2] = "Park";
		names[3] = "Kim";
		names[4] = "Choi";
		
		String[] msg = new String[5];
		msg[0] = "첫번째";
		msg[1] = "두번째";
		msg[2] = "세번째";
		msg[3] = "네번째";
		msg[4] = "다섯번째";
		
		// Hong Enter ==> 첫번째 위치에 있습니다.
		// quit Enter ==> 프로그램 종료
		// Lee  Enter ==> 이런 이름은 없습니다.
		String txt = ""; 
		Boolean chk = false;
		
		while(true) {
			chk = false;
			System.out.print("이름을 입력하세요 ==> ");
			txt = scn.nextLine();
			if(txt.equals("quit")) {
				break;
			}
			
			for(int i = 0 ; i < names.length ; i++) {
				if(names[i].equals(txt)) {
					System.out.println(names[i] + "은/는 " + msg[i] + " 위치에 있습니다.");
					chk = true;
				}
			}
				
			if(!chk) {
				System.out.println("* 해당하는 이름은 없습니다.");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료.");
	}
}
