package reference;

public class ArrayExample3 {
	public static void main(String[] args) {
		// 크기순 정렬 하기.
		
		//(int)(Math.random()*25);
		int num1 = 25;
		int num2 = 22;
		int num3 = 29;
		
		int[] intAry = new int[3];
	
		if( num1 > num2 && num2 > num3 ) {   // num1 > num2 > num3
			intAry[0] = num1;
			intAry[1] = num2;
			intAry[2] = num3;			
		}else if( num1 > num3 && num3 > num2 ) {	// num1 > num3 > num2
			intAry[0] = num1;
			intAry[1] = num3;
			intAry[2] = num2;			
		}else if( num2 > num1 && num1 > num3 ) {	// num2 > num1 > num3
			intAry[0] = num2;
			intAry[1] = num1;
			intAry[2] = num3;			
		}else if( num2 > num3 && num3 > num1 ) {	// num2 > num3 > num1
			intAry[0] = num2;
			intAry[1] = num3;
			intAry[2] = num1;			
		}else if( num3 > num1 && num1 > num2 ) {	// num3 > num1 > num2
			intAry[0] = num3;
			intAry[1] = num1;
			intAry[2] = num2;			
		}else if( num3 > num2 && num2 > num1 ) {	// num3 > num2 > num1
			intAry[0] = num3;
			intAry[1] = num2;
			intAry[2] = num1;			
		}
		
		
		if(num1 > num2) { 
			if(num1 > num3) { 
				if(num2 > num3) {	// num1 > num2 > num3
					
				}else {			// num1 > num3 > num2
					
				}
			}else{ //  num3 > num1 > num2 
				
			}
		}else{	// num2 > num1 
			if(num1 > num3) {	
				if( num1 > num3 ) { // num2 > num1 > num3
					
				}else {	// num2 > num1 > num3
					
				}
			}else {	//
				
			}
		}
		
		if( num2 > num3 ) {
			if(num2 > num1) { 
				if(num3 > num1) {	// num2 > num3 > num1
					
				}else {			// num2 > num1 > num3
					
				}
			}else{ //  num1 > num2 > num3   
				
			}
		}

		
		for(int i = 0; i <= intAry.length ; i++) {
			System.out.println(intAry[i] ) ;
		}
		
		
	}
}
