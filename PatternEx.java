
public class PatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rowCntr,colCntr,spaceCntr;
		int num=5;
		
		System.out.println();
		//pyramid pattern 
		for (rowCntr=1;rowCntr<=num;rowCntr++) {
			
			//for spaces
			for(spaceCntr=1;spaceCntr<=num-rowCntr;spaceCntr++)
				System.out.print(" ");
			for(colCntr=1;colCntr<=rowCntr;colCntr++)
				System.out.print("*" + " ");
			
		
			System.out.println();
		}		
		
		//Right triangle star pattern
		System.out.println();
		for (rowCntr=1;rowCntr<=num;rowCntr++) {
			
			for(colCntr=1;colCntr<=rowCntr;colCntr++)
				System.out.print("*" + " ");
			
		
			System.out.println();
		}
		
		
		
		//Left triangle star pattern
		System.out.println();
		for (rowCntr=1;rowCntr<=num;rowCntr++) {
					
			//for spaces
			for(spaceCntr=1;spaceCntr<=2*num-rowCntr*2;spaceCntr++)
				System.out.print(" ");
			
			for(colCntr=1;colCntr<=rowCntr;colCntr++)
						System.out.print("*" + " ");
					
				
					System.out.println();
		}
		
		//pascal triangle star pattern
				System.out.println();
				for (rowCntr=1;rowCntr<=num;rowCntr++) {
					
					for(colCntr=1;colCntr<=rowCntr;colCntr++)
						System.out.print("*" + " ");
					
				
					System.out.println();
				}
				for (rowCntr=1;rowCntr<=num-1;rowCntr++) {
					
					for(colCntr=1;colCntr<=num-rowCntr;colCntr++)
						System.out.print("*" + " ");
					
				
					System.out.println();
				}
				
				
				
		
	}

}
