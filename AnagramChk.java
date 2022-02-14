
import java.util.*;
public class AnagramChk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputStr1,inputStr2;
		Scanner scnr=new Scanner(System.in);
		System.out.print("enter first string:");
		scnr=new Scanner(System.in);
		inputStr1=scnr.nextLine();
		inputStr1=inputStr1.toLowerCase();
		System.out.print("enter second string:");
		scnr=new Scanner(System.in);
		inputStr2=scnr.nextLine();
		inputStr2=inputStr2.toLowerCase();
		System.out.println(StringOps.anagramChk(inputStr1,inputStr2));
		//System.out.println(StringOps.anagramChk("abcd","ABCD"));
		 

	}

}
