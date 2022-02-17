
public class AlphabetPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rowCntr,colCntr,num;
		num=7;
		colCntr=3;
        for(rowCntr=1;rowCntr<=num;rowCntr++)
        {
        	for(colCntr=1;colCntr<=3;colCntr++)
        		if(colCntr==1 ||colCntr==3)
        			System.out.print("*");
        		else if (rowCntr==(num/2)+1 && colCntr==2 )
        			System.out.print("*");
        		else
        			System.out.print(" ");
        	System.out.println();
        }
	}

}
