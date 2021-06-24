package operator;

public class BitExample {
	public static void main(String[] args) {
		int numb1 = 10;
		numb1 = -numb1;
		
		// ~ 비트 연산자
		System.out.println("1. numb1의 값 : " + ~numb1 + 1); // -111
		System.out.println("2. numb1의 값 : " + (~numb1 + 1)); // -111
		System.out.println("---------------------------------");
		
		int var1, var2, result;
		var2 = var1 = 10;
		
		result = var1 + var2;
		result = sum(var1,var2);
		
		System.out.println("결과값 : " + result);
		
		String name = "김민수";
		String str = welcomeMsg(name);
		System.out.println(str);
		
	}
	
	public static int sum(int a, int b) {
		int val = a + b - 5;
		return val;
	}
	
	public static String welcomeMsg(String n) {
		String name = "Welcome!! " + n;
		return name;
	}
}
