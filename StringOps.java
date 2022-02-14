import java.util.Arrays;

public class StringOps {
	//This method gives the reverse of a string for a given string
	static String revString(String strToBeRev) {
		
		String tempStr="";
		int loopCtr;
		int len=strToBeRev.length();
		
		for (loopCtr=len-1;loopCtr>=0;loopCtr--) {
			tempStr=tempStr+strToBeRev.charAt(loopCtr);
			}
	    return tempStr;	
	}
	
	//This method checks whether the given two strings are anagram or not
	//Returns true if anagram otherwise false
	
	public static boolean anagramChk(String s1,String s2) {
		// TODO Auto-generated method stub
		String inputStr1=s1;//"abcde";
		String inputStr2=s2;//"dabceas";
		
		char[] chArr1=new char[20];
		char[] chArr2=new char[20];
		
		
		//myStr=scnr.nextLine();
		int strIndex;
		//this for loop is for placing all the characters in first string inputStr1 into char array
		for (strIndex=0;strIndex<inputStr1.length();strIndex++) {
			if (inputStr1.charAt(strIndex)!=' '){
				chArr1[strIndex]=inputStr1.charAt(strIndex);
			}
		}
		
		//inputStr1.toCharArray()
		//System.out.println(chArr1[1]);
		
		Arrays.sort(chArr1);
		//this for loop is for placing all the characters in first string inputStr2 into char array
		for (strIndex=0;strIndex<inputStr2.length();strIndex++) {
			if (inputStr2.charAt(strIndex)!=' '){
				chArr2[strIndex]=inputStr2.charAt(strIndex);
			}
		}
		Arrays.sort(chArr2);
		
		//after sorting compare two arrays
		//System.out.println( Arrays.equals(chArr1, chArr2));
		return Arrays.equals(chArr1, chArr2);
		
		 

	}
	
	public static boolean vowelChk(char ch) {
		
		boolean vowelFlag=true;
		switch(ch)
		{
		case 'a','A','e','E','i','I','o','O','u','U':break;
		/*case 'e','E':break;
		case 'i','I':break;
		case 'v','V':break;
		case 'o','O':break;
		case 'u','U':break;*/
		default:vowelFlag=false;
		}
		return vowelFlag;
		/*if (flag)
			System.out.println("YES");//vowel");
		else
			System.out.println("No");//not a vowel");*/
		
	    
	    
	}   
	  
	
}

