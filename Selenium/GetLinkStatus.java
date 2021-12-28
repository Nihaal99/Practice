//GetLinkStatus and FindBrokenLink are interrelated.
//error in running test.
package com.selenium.webelement;

import java.net.HttpURLConnection;
import java.net.URL;

public class GetLinkStatus {
	static int invalidLink;
	public static void verifyLink(String linkString) {
		try {
			URL url=new URL(linkString);
			//Open HTTP Connection
			HttpURLConnection urlConnect=(HttpURLConnection)url.openConnection();
			//Define Timeout
			urlConnect.setConnectTimeout(50000);
			//Hit URL
			urlConnect.connect();
			
			if(urlConnect.getResponseCode()==200) {
				
			}else {
				System.out.println(linkString+" : "+urlConnect.getResponseMessage()+" : "+urlConnect.HTTP_NOT_FOUND);
				invalidLink++;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}
