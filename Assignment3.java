
import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0;;
		String tempStr;
		String myStr,myStr1;
		Scanner scnr=new Scanner(System.in);
		System.out.println("j a v a");
		
		//
		System.out.print("enter a string with spaces:");
		myStr=scnr.nextLine();
		for (i=0;i<myStr.length();i++) {
			if (myStr.charAt(i)!=' '){
				j++;
			}
		}
		System.out.println("String len after removing spaces:"+ j);
				
	    //
		System.out.print("enter a string:");
		myStr=scnr.nextLine();
		System.out.println("String after converting to lowercase:" + myStr.toLowerCase());
		
		//
		System.out.print("enter a string:");
		myStr=scnr.nextLine();
		System.out.println("String after converting to uppercase:" + myStr.toUpperCase());
		
		//
		System.out.print("enter first string:");
		myStr=scnr.nextLine();
		
		System.out.print("enter second  string:");
		myStr1=scnr.nextLine();
		System.out.println("output after concatenating two strings:" +myStr.concat(myStr1));
		
		

	}

}
