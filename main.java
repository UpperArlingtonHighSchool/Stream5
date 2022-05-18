//Code from : https://www.tutorialspoint.com/jfreechart/jfreechart_line_chart.htm

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

import org.jfree.ui.RefineryUtilities;


public class test{
	
	public static void main( String[ ] args ) throws IOException 
	{
	      Scanner file = new Scanner(new File("src/AllTheDataCorrected.txt"));
	      
	      String[][] phTemp = new String[20][4];
	      
	      for (int r=0; r<20; r++)
	      {
	    	  for(int c=0; c<16; c++)
	    	  {
	    		  if (c==0)
	    		  {
	    			  phTemp[r][0] = file.next();

	    		  }
	    		  else if (c==1)
	    		  {
	    			  phTemp[r][1] = file.next();
	    		  }
	    		  else if (c==7)
	    		  {
	    			  phTemp[r][2] = file.next();
	    		  }
	    		  else if (c==9)
	    		  {
	    			  phTemp[r][3] = file.next();
	    		  }
	    		  else
	    		  {
	    			  file.next();
	    		  }
	    	  }
	    	  System.out.println(phTemp[r][0] + "" + phTemp[r][1] + " Temp: " + phTemp[r][2]+ "ph: " + phTemp[r][3]);
	      }
	      LineChart_AWT chart = new LineChart_AWT(
	 	         "pH vs Temperature" ,
	 	         "pH vs Temperature", phTemp);

	      chart.pack( );
	      RefineryUtilities.centerFrameOnScreen( chart );
	      chart.setVisible( true );
	   }}
