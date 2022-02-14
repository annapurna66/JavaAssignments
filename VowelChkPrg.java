import java.util.Scanner;

public class VowelChkPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		char ch;
		System.out.print("enter a character:");
		ch=scnr.nextLine().charAt(0);
		boolean flag;
		flag =true;
		switch(ch)
		{
		case 'a','A','e','E','i','I','o','O','u','U':break;
		/*case 'e','E':break;
		case 'i','I':break;
		case 'v','V':break;
		case 'o','O':break;
		case 'u','U':break;*/
		default:flag=false;
		}
		if (flag)
			System.out.println("YES");//vowel");
		else
			System.out.println("No");//not a vowel");
			
		
	}

}
