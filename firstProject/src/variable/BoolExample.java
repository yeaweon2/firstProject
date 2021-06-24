package variable;

public class BoolExample {
	public static void main(String[] args) {
		boolean existOrNot = true;
		int notExist = 10;
		
		existOrNot = notExist != 50; // == >=
		
		if(!existOrNot) {
			System.out.println("존재하는 값 입니다.");
		}
		
//		if(notExist > 50) {
//			System.out.println("존재하는 값입니다.");
//		}
		
		byte b = 10;
		
		
		if(Byte.MAX_VALUE < 200) {
			System.out.println("참입니다.");
		}
		
		System.out.println("Byte    : " + Byte.MAX_VALUE + " / " + Byte.MIN_VALUE);
		System.out.println("Integer : " + Integer.MAX_VALUE + " / " + Integer.MIN_VALUE);
		System.out.println("Long    : " + Long.MAX_VALUE + " / " + Long.MIN_VALUE);
		
		
		System.out.println("end of prog");
	}
}
