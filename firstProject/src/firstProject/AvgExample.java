package firstProject;

public class AvgExample {
	public static void main(String[] args) {
		// ����, ����, ���� 0 ~ 100
		// ����:85, ����:88, ����:83
		// �հ�, ���
		// �л��̸� : �����̸�
		
		int kor 	= 75;
		int eng 	= 83;
		int math 	= 88;
		
		String name = "�ֿ���";
		
		int    sum 	= kor+eng+math;
		double avg 	= sum/3.0;
		
//		System.out.println(name + " �л��� ���� �հ�� " + sum + "�Դϴ�.");
//		System.out.println(name + " �л��� ���� ����� " + avg + "�Դϴ�.");
		
		System.out.println(name + " �л��� ���� �հ�� " + sum + "�̰�, ����� " + avg + "�Դϴ�.");
	}
}
