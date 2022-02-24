package java8;

import java.util.function.Consumer;
public class ConsumerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Consumer<String> c1=(s)->System.out.println(s);
		Consumer<String> c2=(s)->System.out.println(s.toLowerCase());
	 
	    c1.accept("hello world");
	    c2.accept("this is My String");
	    c1.andThen(c2).accept("HELLO");
	    
	}
	

}
