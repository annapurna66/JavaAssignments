import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strToBeRev="",revStr;
		Scanner scnr=new Scanner(System.in);
		System.out.print("enter a string:");
		strToBeRev=scnr.nextLine();
		
		revStr=StringOps.revString(strToBeRev);
		System.out.println("String after reversing:" +revStr +"\n" +strToBeRev +" is ");
		if(revStr.equals(strToBeRev))
			System.out.print("palindrome");
		else
			System.out.print("not a palindrome");
		
		

	}

}
