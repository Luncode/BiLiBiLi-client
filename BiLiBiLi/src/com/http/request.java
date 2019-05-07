package com.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class request {
	//get请求方法
	public String get(String url) {
		StringBuilder sb = new StringBuilder();
		BufferedReader dataIn = null;
		HttpURLConnection connection = null;
		try {
			URL connurl = new URL(url);
			try {
				connection = (HttpURLConnection)connurl.openConnection();
				connection.connect();
				dataIn = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
	            String line;
	            while ((line = dataIn.readLine()) != null) {// 循环读取流
	                sb.append(line);
	            }
	            dataIn.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return sb.toString();
	}
	
//		//测试类
//			public static void main(String[] args) {
//				request a = new request();
//				System.out.println(a.get(""));
//			}
//	
}
