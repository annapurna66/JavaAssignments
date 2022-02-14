import java.util.Scanner;

public class LargeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		//Finding large numbe between three given numbers
		
		Scanner scnr=new Scanner(System.in);
		int num1,num2,num3;
		
		System.out.print("enter first number:");
		num1=scnr.nextInt();
		System.out.print("enter second number:");
		num2=scnr.nextInt();
		System.out.print("enter third number:");
		num3=scnr.nextInt();
		int smallNum;
		if(num1>num2)
		{
			smallNum=(num1>num3)?num1:num3;
		}
		else
		{
			smallNum=(num2>num3)?num2:num3;
		}
		System.out.println("largest no is :" +smallNum);
	}

}
