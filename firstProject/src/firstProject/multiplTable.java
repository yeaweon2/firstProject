package firstProject;

public class multiplTable {
	public static void main(String[] args) {
		int cal = 0;
				
		for(int a=2; a<10 ; a++) {
			for(int b=1; b<10; b++) {
				cal = a*b;
				System.out.println(a + " * " + b + " = " + cal);
			}
		}
			
	}
}
