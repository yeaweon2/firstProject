package conditions;

public class IfExample {
	public static void main(String[] args) {
		
		// Math.random() ==> 0 ~ 1까지의 실수를 생성해줌
		
		// System.out.println((int)(Math.random()*6)+1);
		int ran = (int)(Math.random()*6)+1;
		if(ran == 1) {
			System.out.println("1번이 나왔습니다.");
		}else if(ran == 2){
			System.out.println("2번이 나왔습니다.");
		}else if(ran == 3){
			System.out.println("3번이 나왔습니다.");
		}else if(ran == 4){	
			System.out.println("4번이 나왔습니다.");
		}else if(ran == 5){
			System.out.println("5번이 나왔습니다.");
		}else if(ran == 6){
			System.out.println("6번이 나왔습니다.");
		}
		
		System.out.println("--------------------------");
		// 1 ~ 100 까지의 임의의 수.
		// score 변수
		int score = (int)(Math.random()*100)+1;
		
		if(score >= 90){
			if(score >= 95) {
				System.out.println(score + "점은 A+학점입니다.");
			}else {
				System.out.println(score + "점은 A학점입니다.");	
			}
		}else if(score >= 80){
			if(score >= 85) {
				System.out.println(score + "점은 B+학점입니다.");
			}else {
				System.out.println(score + "점은 B학점입니다.");	
			}
		}else if(score >= 70){
			if(score >= 75) {
				System.out.println(score + "점은 C+학점입니다.");
			}else {
				System.out.println(score + "점은 C학점입니다.");	
			}
		}else if(score >= 60){
			if(score >= 65) {
				System.out.println(score + "점은 D+학점입니다.");
			}else {
				System.out.println(score + "점은 D학점입니다.");	
			}			
		}else{
			System.out.println(score + "점은 F학점입니다.");
		}
		
		
	}
}
