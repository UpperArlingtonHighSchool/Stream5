//Code from : https://www.tutorialspoint.com/jfreechart/jfreechart_line_chart.htm

import org.jfree.chart.ChartPanel;

import java.util.Arrays;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYDataset;

public class LineChart_AWT extends ApplicationFrame 
{

   public LineChart_AWT( String applicationTitle , String chartTitle, String[][]data ) {
      super(applicationTitle);
      JFreeChart lineChart = ChartFactory.createLineChart(
         chartTitle,
         "pH","Temperature",
         createDataset(data),
         PlotOrientation.VERTICAL,
         true,true,false);
         
      ChartPanel chartPanel = new ChartPanel( lineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      setContentPane( chartPanel );
   }
   private DefaultCategoryDataset createDataset(String[][]data) 
   {
	      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
	      String[] sortedph = new String[20];
	      for (int i=0; i<20; i++)
	      {
	    	  sortedph[i] = data[i][3];
	      }
	      Arrays.sort(sortedph);
	      for (int r=0; r<20; r++)
	      {
	      dataset.addValue(0.0, "" , sortedph[r]);
	      }
	      for (int row=0; row<20; row++)
	      {
	      dataset.addValue(Double.parseDouble(data[row][2]), data[row][1] , data[row][3]);
	      }
	      return dataset;
	}
   }
