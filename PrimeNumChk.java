import java.util.Scanner;

public class PrimeNumChk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr=new Scanner(System.in);
		int num1=0;
		
		// displaying first n multiples of 9
		
		System.out.print("enter a number:");
		num1=scnr.nextInt();
		
		
		System.out.println(NumOps.primeChk(num1));

	}

}
