package dsa450;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class spiralmatrix {

	public static void main(String[] args) {
	
		
		 ArrayList<Integer> spiral = new ArrayList<Integer>();
		 int r=3;
		 int c=3;
		 int matrix[][]= {{1,2,3},{4,5,6}};
	       int startrow=0;
	       int startcol=0;
	       int endrow = r-1;
	       int endcol=c-1;
	       while((startrow<=endrow) && (startcol<=endcol))
	       {
	           for(int i=startcol;i<=endcol;i++)
	           {
	               spiral.add(matrix[startrow][i]);
	           }
	           startrow++;
	           if(startrow<=endrow && startcol<=endcol)
	           {
	               for(int i=startrow;i<=endrow;i++)
	               {
	                   spiral.add(matrix[i][endcol]);
	               }
	           }
	           endcol--;
	           if(startrow<=endrow && startcol<=endcol)
	           {
	               for(int i=endcol;i>=startcol;i--)
	               {
	                   spiral.add(matrix[endrow][i]);
	               }
	           }
	          endrow--;
	           if(startrow<=endrow && startcol<=endcol)
	           {
	               for(int i=endrow;i>=startrow;i--)
	               {
	                   spiral.add(matrix[i][startcol]);
	               }
	           }
	           startcol++;
	       }
	       System.out.println(spiral);
	      

	}

}
