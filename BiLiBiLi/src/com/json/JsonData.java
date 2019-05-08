package com.json;

import com.API.BILIBILIAPI;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.http.request;
/*
 * @anther Luncode
 * 解析JsonData
 * */
public class JsonData {
	
	//https://api.bilibili.com/x/relation/followings?vmid=22753506
	public int getFollowings() {
		int total=0;
		request request = new request();
		String temp=request.get(BILIBILIAPI.followings);
		JsonParser jsonParser = new JsonParser();
		JsonObject json =(JsonObject)jsonParser.parse(temp);
		JsonObject data = json.get("data").getAsJsonObject();
		return data.get("total").getAsInt();
	}
	public int getFollower() {
		request request = new request();
		String temp=request.get(BILIBILIAPI.followers);
		JsonParser jsonParser = new JsonParser();
		JsonObject json =(JsonObject)jsonParser.parse(temp);
		JsonObject data = json.get("data").getAsJsonObject();
		return data.get("total").getAsInt();
	}
	
	//测试类
//	public static void main(String[] args) {
//		JsonData test = new JsonData();
//		System.out.println("粉丝："+test.getFollower()+"关注的人数"+test.getFollowings());
//	}
	
}
