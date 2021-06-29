package basic;

public class multiplTable {
	public static void main(String[] args) {
		int cal = 0;
				
//		for(int a=2; a<10 ; a++) {
//			for(int b=1; b<10; b++) {
//				cal = a*b;
//				System.out.println(a + " * " + b + " = " + cal);
//			}
//		}
		
		for(int a=1; a<10 ; a++) {
			for(int b=2; b<10; b++) {
				cal = a*b;
				System.out.print(b + " * " + a + " = " + cal + "\t");
			}
			System.out.println();
			
		}
		
			
	}
}
