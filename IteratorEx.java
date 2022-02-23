import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList aList1, aList2, aList3;
		aList1 = new ArrayList();
		aList1.add("java");
		aList1.add("c++");
		aList1.add("c");
		aList1.add("python");
		aList1.add("vb");
		Iterator iterator=aList1.iterator();
		System.out.println("printing array list elements using iterator");
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		

	}

}
