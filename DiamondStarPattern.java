import java.util.Scanner;

public class DiamondStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//9 diamond star pattern
		Scanner scnr=new Scanner(System.in);
		System.out.println("diamond star pattern");
		int rowCntr,colCntr,num;
		
		System.out.print("enter a number for diamond pattern:");
		num=scnr.nextInt();
		//print first half of diamond pattern
		for (rowCntr=1;rowCntr<=num;rowCntr++) {
					
			
			
			for(colCntr=1;colCntr<=2*num-1;colCntr++)
			{
			 
			   if(rowCntr+colCntr==num+1|| colCntr-rowCntr==num-1){
				   System.out.print("*" + "");
				}		
			   
			
			   else
				   System.out.print(" ");
				
		}		
			System.out.println();
		}
		
		
		//print second half of diamond pattern
		for (rowCntr=2;rowCntr<=num;rowCntr++) {
					
		
			
			for(colCntr=1;colCntr<=num*2-1;colCntr++)
			{
			  if(colCntr==rowCntr  || (rowCntr+colCntr==num*2)){
				   System.out.print("*" + "");
				}		
			   
			
			   else
				   System.out.print(" ");
				
		}		
			System.out.println();
		

		
		}
		
	
		
	}
}
