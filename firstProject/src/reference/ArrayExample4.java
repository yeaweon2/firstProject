package reference;

import java.util.Scanner;

public class ArrayExample4 {
	
	static int n = 25;
	static int[] intAry = new int[n];
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		// 중복값 제거.	
		for(int i = 0 ; i < intAry.length ; i++) {
			Boolean pass = true;	
			intAry[i] = (int)(Math.random()*n)+1;
			// 이전 값과 비교.
			for(int j = 0; j < i ; j++) {
				if(intAry[i] == intAry[j]) {					
					pass = false;
					break; // 동일한 값이 있으면 for반복문 벗어나기.
				}
				//System.out.print(intAry[j] + "\t");
			}
			if(!pass) {
				i--;
			}
//			System.out.println();
//			System.out.println("i : " + i + " : end ==>" + intAry[i]);
		}
				
		while(true) {
			for(int i = 0 ; i < intAry.length ; i++) {
				show(i);
			}

			System.out.print("=== 숫자 10을 찾으세요(0~24) ==> ");
			int idx = scn.nextInt();
			
			if(idx > 24 || idx < 0 ) {
				System.out.println("잘못된 값을 입력하셨습니다. ( 0 ~ 24 까지의 값을 입력하세요. ) ");
				System.out.println();
				continue; // 계속 진행하지않고 다시 반복의 처음으로 이동.
			}
				
			if(intAry[idx] == 10 ) {
				System.out.println("찾았습니다!!!!!");
				break;
			}else {
				intAry[idx] = 0;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료.");
		
	}
	
	public static void show(int idx) {
		if(intAry[idx] > 0 ) {
			System.out.printf("(%2d)", idx);	
		}else {
			System.out.printf("(**)", idx);
		}
		if( idx%5 == 4 ) {
			System.out.println();
		}
	}
}
