import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Object inputStr;
		String inputStr;
		
		Scanner scnr=new Scanner(System.in);

		ArrayList aList1;
		aList1 = new ArrayList();
		aList1.add("java");
		aList1.add("c++");
		aList1.add("c");
		aList1.add("python");
		aList1.add(12);
		
		
		
		System.out.print("enter a word to search in the arraylist:");
		inputStr=scnr.next();
		
		if  (aList1.contains(inputStr))//
				{
			System.out.println("element  present in the arraylist");
				}
		else
			
			System.out.println("element  not  present in the arraylist");
		
		/*
		Iterator iterator=aList1.iterator();
		System.out.println("finding  array list elements using iterator");
		while (iterator.hasNext())
		{
			//System.out.println(iterator.next());
			if(iterator.next().toString().equals(inputStr))
			{
				System.out.println("present");
				break;
			}
				
		}*/
		
		


	}

}
