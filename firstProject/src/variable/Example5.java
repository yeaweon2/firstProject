package variable;

public class Example5 {
	public static void main(String[] args) {
		
		//교제 p.60 문제 5번
		byte byteValue = 10;
		char charValue = 'A';
		
		int intValue = byteValue;
		int intValue2 = charValue;
		
		// char는 2바이트 음수저장 불가능
		// short는 2바이트 음수를 저장가능 강제타입변환이 필요
		short shortValue = (short)charValue;
		double doubleValue = byteValue;
		
		//교제 p.60 문제 6번
		int intValue3 = 10;
		char charValue2 = 'A';
		double doubleValue2 = 5.7;
		String strValue = "A";
		
		double var = (double)intValue3;
		byte var2 = (byte)intValue3;
		int var3 = (int)doubleValue2;
//		char var4 = (char)strValue;
			
//		String abc;
//		System.out.println(abc);
	}
}
