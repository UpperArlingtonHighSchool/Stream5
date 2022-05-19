//Code from : https://www.tutorialspoint.com/jfreechart/jfreechart_line_chart.htm

//https://coderslegacy.com/java/jfreechart-scatter-plot/#:~:text=The%20JFreeChart%20Scatter%20Plot%20(a.k.a,line%20segments%20joining%20their%20points.
import org.jfree.chart.ChartPanel;

import java.util.Arrays;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class LineChart_AWT extends ApplicationFrame 
{

   public LineChart_AWT( String applicationTitle , String chartTitle, String[][]data ) {
      super(applicationTitle);
      JFreeChart scatterPlot = ChartFactory.createScatterPlot(
         chartTitle,
         "Temperature","pH",
         createDataset(data),
         PlotOrientation.VERTICAL,
         true,true,false);
         
      ChartPanel chartPanel = new ChartPanel( scatterPlot );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      setContentPane( chartPanel );
   }
   private XYDataset createDataset(String[][]data) 
   {
	      XYSeriesCollection dataset = new XYSeriesCollection();
	      XYSeries y2014 = new XYSeries("2014");
	      XYSeries y2015 = new XYSeries("2015");
	      XYSeries y2016 = new XYSeries("2016");
	      XYSeries y2017 = new XYSeries("2017");
	      String[] sortedph = new String[20];
	      for (int i=0; i<20; i++)
	      {
	    	  sortedph[i] = data[i][3];
	      }
	      Arrays.sort(sortedph);
	      
	      for (int row=0; row<20; row++)
	      {
	    	if(data[row][1].equals("2014"))
	    	{
	    		y2014.add(Double.parseDouble(data[row][2]), Double.parseDouble(data[row][3]));
	        }
	    	else if(data[row][1].equals("2015"))
	    	{
	    		y2015.add(Double.parseDouble(data[row][2]), Double.parseDouble(data[row][3]));
	        }
	    	else if(data[row][1].equals("2016"))
	    	{
	    		y2016.add(Double.parseDouble(data[row][2]), Double.parseDouble(data[row][3]));
	        }
	    	else if(data[row][1].equals("2017"))
	    	{
	    		y2017.add(Double.parseDouble(data[row][2]), Double.parseDouble(data[row][3]));
	        }
	    }
	    	
	      dataset.addSeries(y2014);
	      dataset.addSeries(y2015);
	      dataset.addSeries(y2016);
	      dataset.addSeries(y2017);
	  
	      return dataset;
	}
   }
