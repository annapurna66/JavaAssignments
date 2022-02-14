import java.util.*;
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr=new Scanner(System.in);
		int num1,num2;
		
		System.out.print("enter a  number to find the multipples:");
		num1=scnr.nextInt();
		System.out.println("first three multiples are:" +num1 + " " +num1*2 + " " +num1*3);
		
		//
		
		System.out.print("enter a  number to find the cube:");
		num1=scnr.nextInt();
		System.out.println("cube of " +num1 +" is :" +(num1*num1*num1));
		
		//
		System.out.print("enter  length of rectangle:");
		num1=scnr.nextInt();
		System.out.print("enter breadth of rectangle:");
		num2=scnr.nextInt();
		System.out.println("Area of the rectangle is:" +num1 *num2);
		
		//to find the smaller numbe in two numbers
		
		//
		System.out.print("enter first number:");
		num1=scnr.nextInt();
		System.out.print("enter second number:");
		num2=scnr.nextInt();
		if(num1==num2) {
			System.out.println("both are equal");
		}
		else if(num1>num2)
			System.out.println("smaller number  is:" +num2 );
		else
			System.out.println("smaller number  is:" +num1 );


	}

}
