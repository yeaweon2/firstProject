package reference;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3.점수LIST 4.분석 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택==>");
			
			int selectNo = scn.nextInt();
			int studentNo = 0;
			
			if( selectNo == 1 ) {			// 학생수 입력
				System.out.print("학생수를 입력하세요 ==>");
				studentNo = scn.nextInt();
				scores = new int[studentNo];
			}else if( selectNo == 2 ) {		// 점수입력
				System.out.print("점수를 입력하세요.");
				if(studentNo == 0) {
					System.out.println("학생수를 먼저입력해주세요.");
				}else {
					
				}
			}else if( selectNo == 3 ) {		// 점수LIST
			
			}else if( selectNo == 4 ) {		// 분석
				
			}else {							// 종료
				System.out.println("종료합니다......");
				break;
			}
			System.out.println("프로그램 종료.");
		}
	}
	
}
