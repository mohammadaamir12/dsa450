package dsa450;

public class palindromeString {

	public static void main(String[] args) {
		 String str = "A. man, a plan, a canal: Panama";
		 str=str.toLowerCase();
	        // Call the replaceAll() method
		 str = str.replaceAll("[ .,:]", ""); 
		 
	 
	        System.out.println(str);

	}

}
