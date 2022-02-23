import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedSet sortSet=new TreeSet();
		//SortedSet <String>sortSet=new TreeSet<String>();
		//sortSet.add(null);//we can not add null 
		sortSet.add("Kerala");
		sortSet.add("Tamilnadu");
		sortSet.add("Andhra Pradesh");
		sortSet.add("Karnataka");
		sortSet.add("Kerala");
		sortSet.add("Maharashtra");
		sortSet.add("Madhya Pradesh");
		sortSet.add("Bihar");
		sortSet.add("Telangana");
		//sortSet.add(10);
		
		
		System.out.println("sortset:"+sortSet);
		System.out.println("first element:" +sortSet.first());
		System.out.println("last element:" +sortSet.last());
		System.out.println(sortSet.headSet("Kerala"));//less than the element
		System.out.println(sortSet.tailSet("Kerala"));//greater or equal to the element
		System.out.println(sortSet.subSet("Karnataka","Tamilnadu"));//from element inclusive,to element exclusive
		

	}

}
