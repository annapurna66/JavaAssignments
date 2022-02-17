import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr="java";
		Scanner scnr=new Scanner(System.in);

		ArrayList aList1;
		aList1 = new ArrayList();
		aList1.add("java");
		aList1.add("c++");
		aList1.add("c");
		aList1.add("python");
		//aList1.add(12);
		
		System.out.println("enter a word to search in the arraylist:");
		inputStr=scnr.next().toString();
		//inputStr="12";
		Object obj=inputStr;
		//System.out.println("inputStr:"+inputStr);
		
		if  (aList1.contains(obj))//
				{
			System.out.println("element  present in the arraylist");
				}
		else
			
			System.out.println("element  not  present in the arraylist");
		
	
		
		//Initialising an array list
		ArrayList<String> aList2 = new ArrayList<String>(
	            Arrays.asList("hello",
	                          "world",
	                          "new"));
	     
	     
	     System.out.println("ArrayList2:" + aList2);
	    
	     ArrayList colorsAL=new ArrayList<>();
	     colorsAL.add("Green");
	     colorsAL.add("Blue");
	     colorsAL.add("Red");
	     colorsAL.add("Yellow");
	     colorsAL.add("Orange");
	     colorsAL.add("Violet");
	     
	     System.out.println("colos ArrayList:" +colorsAL);
	     
	     System.out.println("colos ArrayList using iterator");
	     Iterator itr=colorsAL.iterator();
	     while(itr.hasNext())
	     {
	    	 System.out.print(itr.next() + " ");
	     }
	     
	     
	     
	     
	    
	}
}	
	 