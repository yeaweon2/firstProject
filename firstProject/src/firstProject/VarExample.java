package firstProject;

public class VarExample {
	public static void main(String[] args) {
		int kor = 60;
		int eng;
		eng = 71;
		
		int sum = kor + eng;
		System.out.println("�� ���� �� : "+sum);
		
//		sum = 100;
		
		double avg  = sum/2	 ; //65.5 => 65.0  ���������� �Ǽ�ǥ���ȵ�. ����Ÿ������ ����
		double avg2 = sum/2.0; //65.5 		   doubleŸ�Կ����� doubleŸ������ ����
		
		System.out.println("�� ��  : " + avg);
		System.out.println("�� ��2 : " + avg2);
		
		System.out.println("�� ���� �� : " + kor*eng);
		
		double sum1 = 0.2;
	}
}
