
public class NumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rowCntr,colCntr;
        int num=1;
		for (rowCntr=1;rowCntr<=5;rowCntr++) {
			
			for(colCntr=1;colCntr<=rowCntr;colCntr++)
			{
				System.out.print(num + " ");
			    num++;
			}
		
			System.out.println();
		}
		
	}

}
