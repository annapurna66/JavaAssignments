import java.util.Scanner;

import java.util.*;
public class NumPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printing n numbers in descending order in separate line
		Scanner scnr=new Scanner(System.in);
		int n,i;
		
		System.out.print("enter a number:");
		n=scnr.nextInt();
		
		for (i=n;i>=1;i--)
			System.out.println(i);
		
		
		//float value in separate line
		
		System.out.println("printing float values:");
		float f1=2.3f,f2=4.5f,f3=7.8f;
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		

	}

}
