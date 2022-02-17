
public class PatternEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rowCntr,colCntr,num,spaceCntr;
		num=5;
		
		//Downward Triangle Star pattern
		for (rowCntr=1;rowCntr<=num;rowCntr++) {
			
			for(colCntr=1;colCntr<=num-rowCntr+1;colCntr++)
				System.out.print("*" + " ");
			
		
			System.out.println();
		}
		
		//mirrored right triangle 
		
		
		System.out.println();
		for (rowCntr=1;rowCntr<=num;rowCntr++) {
					
			//for spaces
			for(spaceCntr=1;spaceCntr<=num-rowCntr;spaceCntr++)
				System.out.print(" ");
			
			for(colCntr=1;colCntr<=rowCntr;colCntr++)
						System.out.print("*" + "");
					
				
					System.out.println();
		}
		//reverse pyramid star
		    System.out.println();
			for (rowCntr=1;rowCntr<=num;rowCntr++) {
			
			//for spaces
			for(spaceCntr=1;spaceCntr<=rowCntr;spaceCntr++)
				System.out.print(" ");
			for(colCntr=rowCntr;colCntr<=num;colCntr++)
				System.out.print("*" + " ");
			
		
			System.out.println();
		}
			
			
		//right down mirror star
			System.out.println();
			for (rowCntr=1;rowCntr<=num;rowCntr++) {
				//for spaces
				for(spaceCntr=1;spaceCntr<=rowCntr;spaceCntr++)
					System.out.print(" ");
				
				
				for(colCntr=1;colCntr<=num-rowCntr+1;colCntr++)
					System.out.print("*" + "");
				
			
				System.out.println();
			}
			
			//Left triangle pascal
			System.out.println();
			for (rowCntr=1;rowCntr<=num;rowCntr++) {
						
				//for spaces
				for(spaceCntr=1;spaceCntr<=num-rowCntr;spaceCntr++)
					System.out.print(" ");
				
				for(colCntr=1;colCntr<=rowCntr;colCntr++)
							System.out.print("*" + "");
						
					
						System.out.println();
			}
			
			//System.out.println("num:" +num);
			for (rowCntr=1;rowCntr<=num-1;rowCntr++) {
				
				//System.out.println("num:" +num);
				//for spaces
				for(spaceCntr=1;spaceCntr<=rowCntr;spaceCntr++)
					System.out.print(" ");
				
				
				for(colCntr=1;colCntr<=num-rowCntr;colCntr++)
					System.out.print("*" + "");
				
			
				System.out.println();
			}
			//sand glass star pattern
			
			System.out.println("sand glass star pattern");
			for (rowCntr=1;rowCntr<=num;rowCntr++) {
			
			//for spaces
			for(spaceCntr=1;spaceCntr<=rowCntr;spaceCntr++)
				System.out.print(" ");
			for(colCntr=rowCntr;colCntr<=num;colCntr++)
				System.out.print("*" + " ");
			
		
			System.out.println();
			
			}
			for (rowCntr=1;rowCntr<=num-1;rowCntr++) {
				
				//for spaces
				
				for(spaceCntr=1;spaceCntr<=num-rowCntr;spaceCntr++)
					System.out.print(" ");
				
				for(colCntr=1;colCntr<=rowCntr+1;colCntr++)
					System.out.print("*" + " ");
				
			
				System.out.println();
			
		   }
			
			
			//9 triangle star pattern
			
			System.out.println("triangle star pattern");
			num=5;
			for (rowCntr=1;rowCntr<=num;rowCntr++) {
						
				
				
				for(colCntr=1;colCntr<=9;colCntr++)
				{
				   if (rowCntr==5) {
					System.out.print("*" + "");
					}
				   else if(rowCntr+colCntr==6|| colCntr-rowCntr==4){
					   System.out.print("*" + "");
					}		
				   
				
				   else
					   System.out.print(" ");
					
			}		
				System.out.println();
			}
			
			
			
			//end of triangle star pattern

			
			//10.Down triangle star pattern
			System.out.println("Down triangle star pattern");
			num=5;
			for (rowCntr=1;rowCntr<=num;rowCntr++) {
						
				
				
				for(colCntr=1;colCntr<=9;colCntr++)
				{
				   if (rowCntr==1) {
					System.out.print("*" + "");
					}
				   else if(colCntr==rowCntr  || (rowCntr+colCntr==10)){
					   System.out.print("*" + "");
					}		
				   
				
				   else
					   System.out.print(" ");
					
			}		
				System.out.println();
			}
			
			
			//end of Down triangle star pattern			
			
			
			

		
			}
			
		
		
		

	

}
