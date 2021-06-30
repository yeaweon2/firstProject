package reference;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int[] scores = null;
		String selectNo = "";
		int studentNo = 0;
		int maxValue = 0;
		int grade = 0;
		double avg = 0.0;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수LIST | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택 ==> ");
			
			selectNo = scn.next();
			studentNo = 0;
			
			if( selectNo.equals("1") || selectNo.equals("학생수")) {			// 학생수 입력
				System.out.print("학생수를 입력하세요 ==> ");
				studentNo = scn.nextInt();
				scores = new int[studentNo];
			}else if( selectNo.equals("2") || selectNo.equals("점수입력") ) {		// 점수입력
				System.out.println("점수를 입력하세요.");
				if( scores == null ) {
					System.out.println("학생 정보가 없습니다. 먼저 학생수를 입력해주세요.");
				}else {
					for(int i = 0 ; i < scores.length ; i++) {
						System.out.print("scores[" + i + "] ==> ");
						grade = scn.nextInt();
						if( grade > 0 && grade <= 100) {
							scores[i] = grade;
						}else {
							System.out.println("점수의 범위가 잘못 되었습니다. ( 1 ~ 100 )");
							i--;
						}
					}
				}
			}else if( selectNo.equals("3") || selectNo.equals("점수LIST") || selectNo.equals("점수list") ) {		// 점수LIST
				if( scores == null ) {
					System.out.println("학생 정보가 없습니다. 먼저 학생수를 입력해주세요.");
				}else {
					for(int i = 0 ; i < scores.length ; i++) {
						System.out.println("scores[" + i + "] ==> " + scores[i] );
					}		
				}
			}else if( selectNo.equals("4") || selectNo.equals("분석") ) {		// 분석
				if( scores == null ) {
					System.out.println("학생 정보가 없습니다. 먼저 학생수를 입력해주세요.");
				}else {
					for(int i = 0 ; i < scores.length ; i++) {
						if(maxValue < scores[i]) {
							maxValue = scores[i];
						}
						avg = avg + scores[i];
					}	
					avg = avg / scores.length;
					System.out.println("최고점수 ==> " + maxValue );
					System.out.println("평균점수 ==> " + avg );
				}
			}else if(selectNo.equals("5") || selectNo.equals("종료")) {							// 종료
				System.out.println("종료합니다......");
				break;
			}else {
				System.out.println("메뉴이름을 다시 입력해주세요.");
			}
			
		}
		System.out.println("프로그램 종료.");
	}
	
}
