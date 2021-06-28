package reference;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = 0;
		int[] intAry = new int[3];	// 배열의 크기만 선언.
		intAry = new int[] { 55, 65, 75, 90, 2 };
		intAry[2] = 88;
			
		int sum = 0;
		
		for(int i = 0; i < intAry.length ; i++) {
			sum = sum + intAry[i];
		}
		System.out.println("intAry의 합 : " + sum);
		
		int[] intAry2 = { 1, 2, 3, 4, 5 };	// 배열의 5의 크기의 각 위치에 값을 저장.
		sum = 0;
		
		for(int i = 0; i < intAry2.length ; i++) {
			intAry2[i] += 80;
			sum = sum + intAry2[i];
		}
		System.out.println("intAry2의 합 : " + sum);

//		for(int i = 0; i < 3 ; i++) {
//			System.out.println("값을 입력하세요==> ");
//			num = scn.nextInt();
//			intAry[i] = num;
//		}
//		System.out.println(intAry[0]);
//		System.out.println(intAry[1]);
//		System.out.println(intAry[2]);
	}
	
	public static void aryExam() {
		int[] scores = new int[5];
		scores[0] = 70;
		scores[1] = 75;
		scores[2] = 80;
		scores[3] = 85;
		scores[4] = 90;
		
		int sum = 0;
		
		for(int i = 0 ; i < 5; i++) {
			sum += scores[i];
			System.out.println(scores[i]);
		}
		
		double avg = sum / 5.0;
		System.out.println("합계 ==> " + sum);
		System.out.println("평균 ==> " + avg );
		
	}
	
	public static void intExam() {
		int score1 = 70;
		int score2 = 75;
		int score3 = 80;
		int score4 = 85;
		int score5 = 90;
		int sum = 0;
		sum = score1 + score2 + score3 + score4 + score5;
		double avg = sum/5.0;
		System.out.println( "평균 : " + avg );
	}
}
