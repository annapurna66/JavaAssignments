import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList linkList1=new LinkedList();
		
		linkList1.add("world");
		linkList1.add("great");
		linkList1.add("hello");
		linkList1.add("language");
		linkList1.add("english");
		linkList1.add("green");
		linkList1.add("keyboard");
		linkList1.add("mouse");
		
		
		
		ListIterator listItr=linkList1.listIterator();
		
		while (listItr.hasNext())
		{
			//System.out.println(listItr.nextIndex());
			if(listItr.nextIndex()==2) {
			  listItr.remove();
			  //listItr.set(); //used to change the value in the current position
			  System.out.println("inside if");
			}  
			System.out.println(listItr.next());
			
	        //listItr.remove();
			
		}
		System.out.println(linkList1);

	}

}
