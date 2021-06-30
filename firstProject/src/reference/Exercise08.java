package reference;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] array = {
				{ 95 , 86 },
				{ 83 , 92 , 96 },
				{ 78 , 83 , 93 , 87 , 88 }
		};
		
		int[][] array2 = null;
		
		int sum = 0;
		double avg = 0.0;
		int length = 0;
		
		for( int i = 0 ; i < array.length ; i++ ) {
			for( int j = 0 ; j < array[i].length ; j++ ) {
				sum = sum + array[i][j];
			}
			length = length + array[i].length;
		}
		avg = (double)(sum) / (double)(length);
		System.out.println( sum + " / " + length + " = " + avg );
		
		System.out.println("sum ==> " + sum );
		System.out.println("avg ==> " + avg );
		
		// 배열복사
//		System.arraycopy(array, 0, array2, 0, array.length);
//				
//		for( int i = 0 ; i < array2.length ; i++ ) {
//			for( int j = 0 ; j < array2[i].length ; j++ ) {
//				System.out.println(array2[i][j]);
//			}
//		}
	}
}
