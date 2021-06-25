package conditions;

import java.util.Scanner;

public class WhileExample5 {
	public static void main(String[] args) {
		// 임의의 수 => 가위, 바위, 보
		int ran = (int)(Math.random()*3);
		String rsp = "";
		
		if( ran == 0 ) 		{ rsp = "가위"; 	}
		else if( ran == 1 ) { rsp = "바위"; 	}
		else if( ran == 2 ) { rsp = "보"; 	}
		
		Scanner scn = new Scanner(System.in);
		String strs = "게임을 시작합니다.....";
		
		for(int i=0; i<strs.length();i++) {
			System.out.print(strs.charAt(i));
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("");
		System.out.println("가위, 바위, 보 ===>");
		String str = scn.nextLine();
		
		if(rsp.equals(str)) {	// 같은경우 비김
			System.out.println(">>>> Same Same");
		}else {					// 다를경우
			if( ran == 0 ) { 			// 가위일경우
				if(str.equals("바위")) {
					System.out.println(">>>> You Win !!");
				}else {
					System.out.println(">>>> You Lose ...");
				}
			} else if ( ran == 1 ) {	//바위일 경우
				if(str.equals("보")) {
					System.out.println(">>>> You Win !!");
				}else {
					System.out.println(">>>> You Lose ...");
				}
			} else {					// 보일 경우
				if(str.equals("가위")) {
					System.out.println(">>>> You Win !!");
				}else {
					System.out.println(">>>> You Lose ...");
				}
			}
		}
		System.out.println(">>>> PC : " + rsp + " / You : " + str );
		System.out.println("<<< 가위바위보 종료 >>>");
	}
}
