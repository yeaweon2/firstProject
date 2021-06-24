package operator;

public class LogicOperatorExample2 {
	public static void main(String[] args) {
		int score = 85;
		
		if( score >= 60 && score < 70) { 	// 60~69 D
			System.out.println("D학점");
		}else if(score >= 70 && score < 80) {	// 70~79 C
			System.out.println("C학점");
		}else if(score >= 80 && score < 90) {	// 80~89 B
			System.out.println("B학점");
		}else if(score >= 90 ) {				// 90~ A
			System.out.println("A학점");
		}else {
			System.out.println("Fail");
		}
	}
}
