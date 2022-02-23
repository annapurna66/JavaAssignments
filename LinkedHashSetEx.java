import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	/*
	 * null can be added
	 * insertion order is  maintained
	 * duplicates are not allowed
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet linkedHashSet=new LinkedHashSet();
		
		linkedHashSet.add(null);
		linkedHashSet.add("India");
		linkedHashSet.add("Japan");
		linkedHashSet.add("Srilanka");
		linkedHashSet.add("Germany");
		linkedHashSet.add("Australia");
		linkedHashSet.add("UK");
		linkedHashSet.add("Germany");
		System.out.println("LinkedHashSet:"+linkedHashSet);
		
		
	}

}
