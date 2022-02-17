import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class HashsetEx {
	/*
	 * null can be added
	 * insertion order is not maintained
	 * duplicates are not allowed
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String inputStr;
        Scanner scnr=new Scanner(System.in);
		HashSet hashSet=new HashSet();
		hashSet.add(null);
		hashSet.add("India");
		hashSet.add("Japan");
		hashSet.add("Srilanka");
		hashSet.add("Germany");
		hashSet.add("Australia");
		hashSet.add("UK");
		hashSet.add("Germany");
		System.out.println("enter a word to search in HashSet:");
		inputStr=scnr.next().toString();
		System.out.println("hashSet val:"+hashSet);
		if (hashSet.contains(inputStr))
			System.out.println("element present");
		else
		
			System.out.println("element not  present");
		
		
		//initialising HashSet
		ArrayList<Integer> hashSet1=new ArrayList<Integer>(
	            Arrays.asList(1,2,67,3,45,6));
   
		
	}

}
