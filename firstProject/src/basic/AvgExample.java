package basic;

public class AvgExample {
	public static void main(String[] args) {
		// 국어, 영어, 수학 0 ~ 100
		// 국어:85, 수학:88, 영어:83
		// 합계, 평균
		// 학생이름 : 본인이름
		
		int kor 	= 75;
		int eng 	= 83;
		int math 	= 88;
		
		String name = "최예원";
		
		int    sum 	= kor+eng+math;
		double avg 	= sum/3.0;
		
//		System.out.println(name + " 학생의 점수 합계는 " + sum + "입니다.");
//		System.out.println(name + " 학생의 점수 평균은 " + avg + "입니다.");
		
		System.out.println(name + " 학생의 점수 합계는 " + sum + "이고, 평균은 " + avg + "입니다.");
	}
}
