package com.API;

public class BILIBILIAPI {
	public static String Userid="22753506";//暂时用自己b站的uid
	final public static String index="http://www.bilibili.com";
	final public static String bangumi =" https://bangumi.bilibili.com/api/timeline_v2_global";
	final public static String Newbangumi = "https://bangumi.bilibili.com/web_api/timeline_global";
	final public static String followings = "https://api.bilibili.com/x/relation/followings?vmid="+Userid;
	final public static String followers = "https://api.bilibili.com/x/relation/followers?vmid="+Userid;
	final public static String userinfo = "https://api.bilibili.com/x/space/myinfo";
	final public static String miduserinfo = "https://api.bilibili.com/x/space/acc/info?mid=";
}	
//bangumi =>  https://bangumi.bilibili.com/api/timeline_v2_global
//
//新番时刻表 => https://bangumi.bilibili.com/web_api/timeline_global
//
//followings => https://api.bilibili.com/x/relation/followings?vmid=22753506
//
//followers =>https://api.bilibili.com/x/relation/followers?vmid=22753506
//
//userinfo => https://api.bilibili.com/x/space/myinfo
//
//miduserinfo =>https://api.bilibili.com/x/space/acc/info?mid=34818804
//画友 => https://api.vc.bilibili.com/link_draw/v2/Doc/index?type=recommend&page_num=0&page_size=45
