package operator;

public class IfExample {
	public static void main(String[] args) {
		// if (){ } 
		int v1 = 30;
		int v2 = 30;
		
		if( v1 > v2 ) {
			System.out.println("v1이 v2보다 큽니다.");
		}else if( v1 == v2){
			System.out.println("v1과 v2는 값습니다.");
		}else{
			System.out.println("v2가 v1보다 큽니다.");
		}
		
		System.out.println("--------------------------");
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		// String는 클래스 ==> 주소참조
		// 주소값 비교
//		if (str1 == str3) {
		// 문자열 비교
		if (str1.equals(str3)) {
			System.out.println("같은 이름입니다.");
		}else {
			System.out.println("다른 이름입니다.");
		}
		
		System.out.println("--------------------------");
		System.out.println("end of prog.");
	}
}
