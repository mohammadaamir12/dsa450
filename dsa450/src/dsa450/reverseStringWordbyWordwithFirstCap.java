package dsa450;

import java.util.Scanner;

public class reverseStringWordbyWordwithFirstCap {

	public static void main(String[] args) {
		   Scanner sec = new Scanner(System.in);
	        String st = sec.nextLine();
	         String[] split =  st.split("\\s+");
	        
	          String h = "";

	         for(int i=0;i<split.length;i++){
	            StringBuilder input1 = new StringBuilder();
	            input1.append(split[i].toLowerCase());
	            input1.reverse();
	            String output = input1.substring(0, 1).toUpperCase() + input1.substring(1);
	            h+= output+" ";
	        }
	         System.out.println(h.trim());
	        sec.close();

	}

}
