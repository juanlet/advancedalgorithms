package WebCrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {
   
	private Queue<String> queue;
	private List<String> discoveredWebsitesList;
	
	public WebCrawler() {
		this.queue = new LinkedList<>();
		this.discoveredWebsitesList = new ArrayList<>();
	}
	
	public void discoverWeb(String root) {
		
		this.queue.add(root);
		this.discoveredWebsitesList.add(root);
		
		while(!this.queue.isEmpty()) {
			
			String webSiteUrl = this.queue.remove();
			
			
			//extract html
			String rawHtml = readUrl(webSiteUrl);
            
			
			//look for links
		 	
			//create regex
			String regexp = "http://(\\w+\\.)*(\\w+)"; 
			Pattern pattern = Pattern.compile(regexp);
			Matcher matcher = pattern.matcher(rawHtml);
			//while it has more ocurrences keep looping
			//loop discoveredLinks
			while(matcher.find()) {
				//get the ocurrence that was found by matcher.find() method
				String actualUrl = matcher.group();
				//if link has not been added				
				if( !discoveredWebsitesList.contains(actualUrl)) {
					//add link to discoveredWebsitesList
					discoveredWebsitesList.add(actualUrl);
					System.out.println("Website has been found with URL: "+actualUrl);
					queue.add(actualUrl);
				}
			}
			


			
			
			
		}
		
	}

	private String readUrl(String webSiteUrl) {
		// TODO Auto-generated method stub
		String rawHtml = "";
		
		try {
			URL url = new URL(webSiteUrl);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String inputLine = "";
			
			while( (inputLine = in.readLine()) != null) {
				rawHtml += inputLine;
			}
			
			in.close();
			
		}catch(Exception e) {
		  e.printStackTrace();	
		}
		
		return rawHtml;
		
	}
}
