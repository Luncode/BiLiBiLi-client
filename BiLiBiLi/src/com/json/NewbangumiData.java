package com.json;

import com.API.BILIBILIAPI;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.http.request;

public class NewbangumiData {
	public static String GetNewbangumiData() {
		String GetNewbangumiDatatemp="";
		request request = new request();
		GetNewbangumiDatatemp=request.get(BILIBILIAPI.Newbangumi);
		JsonParser parser = new JsonParser();
		JsonObject data =(JsonObject)parser.parse(GetNewbangumiDatatemp);
		//JsonObject result = data.get("result").getAsJsonObject();
		//System.out.println(data.get("result"));	
		return GetNewbangumiDatatemp;
	}
//	public static void main(String[] args) {
//		NewbangumiData data = new NewbangumiData();
//		data.GetNewbangumiData();
//	}
}
