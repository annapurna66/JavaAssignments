
public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word ="java";
		String Word = " comp";
		// String word@  = “java string”;//invalid variable declaration
		String word1 = "Java string";
		//String 12word ;invalid variable dec
		 //String int = "java";//keyword can not be assigned to int
		//String *java ;//= “java”;//invalid variable dec
		String symbol$ = "100 dollars";
		 String word_;
		
		// String word-;//syntax error invalid variable declaration
		 String capital = "delhi";
		 
		 String myStr=" this string contains few words";
		 myStr=myStr.trim();
		 System.out.println("string after trimming:"+ myStr);
		 int i=0;
		 int wordcount=0;
		 for (i=0;i<myStr.length();i++) {
			 if (myStr.charAt(i)==' '){
				 System.out.println("space encountered");
			 }
			 
		 }

	}
	
	

}
