package firstProject;

public class NumberExample {
	public static void main(String[] args) {
		byte math = 30;	// -128 ~ 127
		byte eng = 50;
		
		// ���������� int�� �������� ��
//		byte sum = math + eng;
//		int sum = math + eng;

		byte sum = (byte)(math + eng);
		
		System.out.println("�� ������ �� : " + sum);
		
	}
}
