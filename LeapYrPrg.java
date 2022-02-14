import java.util.Scanner;

public class LeapYrPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		int num1;
		
		//to check whether given year is leap year or not;
		
		System.out.print("enter a year:");
		num1=scnr.nextInt();
		if ((num1%4==0 && num1%100 !=0) || num1%400==0)
			System.out.println("Y");//Leap year");
		else
			System.out.println("N");//not a Leap year");	
		

	}

}
