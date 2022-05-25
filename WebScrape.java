import java.io.IOException;
import java.io.StringWriter;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.Scanner;

import javax.xml.transform.OutputKeys;

import javax.xml.transform.Transformer;

import javax.xml.transform.TransformerFactory;

import javax.xml.transform.dom.DOMSource;

import javax.xml.transform.stream.StreamResult;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;

import org.jsoup.nodes.Element;

import org.w3c.dom.Node;

public class WebScrape {
	
	public WebScrape() throws IOException
	{
final Document document=  Jsoup.connect("http://des.butlercountyohio.org/html/drinkingwater/waterquality.cfm").get();
String str= document.toString();

//System.out.print(str);
Scanner chop=new Scanner(str);
while(chop.hasNext())
{
	if(chop.next().equals("<td><strong>pH</strong></td>"))
	{chop.next();
	chop.next();
	chop.next();
	
	String pH=chop.next();
    pH=pH.substring(18,21);
	System.out.println("pH of River: " + pH);
	}
	
}



	
	}



}
