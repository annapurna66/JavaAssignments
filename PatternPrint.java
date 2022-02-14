import java.util.Scanner;

public class PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number:");
		Scanner scnr=new Scanner(System.in);
		int num=scnr.nextInt();
		int rowCntr,colCntr,spaceCntr;
		//pattern1
		System.out.println();
		for (rowCntr=1;rowCntr<=num;rowCntr++) {
			for(colCntr=rowCntr;colCntr<=num;colCntr++)
				System.out.print(colCntr + " ");
		
			System.out.println();
		}		
		
		System.out.println();
		//pattern 2
		for (rowCntr=1;rowCntr<=num;rowCntr++) {
			
			//for spaces
			for(spaceCntr=1;spaceCntr<=rowCntr;spaceCntr++)
				System.out.print(" ");
			for(colCntr=rowCntr;colCntr<=num;colCntr++)
				System.out.print(colCntr + " ");
			
		
			System.out.println();
		}		
		
	}

}
