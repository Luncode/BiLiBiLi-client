package com.json;

import java.util.ArrayList;
import java.util.Iterator;

import com.API.BILIBILIAPI;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.http.request;

public class NewbangumiData {
	public static JsonArray GetNewbangumiData() {
		String GetNewbangumiDatatemp="";
		request request = new request();
		GetNewbangumiDatatemp=request.get(BILIBILIAPI.Newbangumi);
		JsonParser parser = new JsonParser();
		JsonObject data =(JsonObject)parser.parse(GetNewbangumiDatatemp);
		JsonArray result = data.get("result").getAsJsonArray();
//		Iterator iterator = result.iterator();
//		System.out.println("result:");
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		return result;
	}
	public static void main(String[] args) {
		NewbangumiData data = new NewbangumiData();
		JsonArray result= data.GetNewbangumiData();
		Iterator iterator = result.iterator();
		System.out.println("\t\t\tresult");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
