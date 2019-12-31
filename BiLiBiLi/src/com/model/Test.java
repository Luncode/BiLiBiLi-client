package com.model;

import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;
import com.http.request;
import com.model.JsonModel.ResultBean;
import com.model.JsonModel.ResultBean.SeasonsBean;

public class Test {
	//������
    public static void main(String[] args) {
    	
    	List list = getResultList(getMainData());
		
		Iterator<ResultBean> relIterator = list.iterator();
		System.out.println("��õķ�����Ϣ");
		while(relIterator.hasNext()) {
			List sealist = relIterator.next().getSeasons();
			//System.out.println(relIterator.next().getSeasons());
			Iterator<SeasonsBean> rIterator = sealist.iterator();  //���13��List����
			Iterator<SeasonsBean> rIterator2 = sealist.listIterator(2);
			
			//System.out.println(rIterator);
			while(rIterator.hasNext()) {
				System.out.print(rIterator.next().getTitle()+"\t");
				System.out.println();
			}
//			while(rIterator2.hasNext()) {
//				System.out.println(rIterator2.next().getPub_time());
//			}
		}
	}
    public static List getMainData() {
    	request request = new request();
		String tempdata=request.get("https://bangumi.bilibili.com/web_api/timeline_global");
		Gson gson = new Gson();
		JsonModel model = gson.fromJson(tempdata, JsonModel.class);
//		System.out.println(model.getCode());
//		System.out.println(model.getMessage());
		return model.getResult();
	}
	public static List getResultList(List list) {
		List ResultList = list;
		return ResultList;
	}
}
