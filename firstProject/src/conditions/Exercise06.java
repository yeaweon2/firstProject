package conditions;

public class Exercise06 {
	public static void main(String[] args) {
		//for문을 이용하여 삼각형 출력
		for(int a = 1; a<=5 ; a++ ) {
			if(a == 1)
				System.out.println("*");
			else if(a ==2)
				System.out.println("**");
			else if(a == 3)
				System.out.println("***");
			else if(a == 4)
				System.out.println("****");
			else if(a == 5)
				System.out.println("*****");
		}
	}
}
