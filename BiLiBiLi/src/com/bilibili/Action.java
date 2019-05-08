package com.bilibili;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.API.BILIBILIAPI;
import com.API.UserID;
import com.json.JsonData;
/*
 * @anther Luncode
 * 事件监听
 * */
public class Action implements ActionListener{
	public void actionPerformed(ActionEvent event) {
		
		if (event.getActionCommand().equals("关于作者")) {
			JOptionPane.showMessageDialog(null, "Github:Luncode\n"
					+ "同时感谢第三方jar包开发人员chrriis,Google,Java\n"
					+ "DJNativeSwing.jar\n"
					+ "gson-2.8.5.jar\n"
					+ "DJNativeSwing-SWT.jar\n"
					+ "SWT4.3.jar ");
		}else if(event.getActionCommand().equals("个人中心")){
			JsonData js = new JsonData();
			int follower=js.getFollower();
			int folloing=js.getFollowings();
			JOptionPane.showMessageDialog(null, "粉丝数量:"+follower+"\n关注的人数:"+folloing);
		}else if(event.getActionCommand().equals("提交UID")){
			BILIBILIAPI.Userid=UserID.useruidtext.getText();
			//System.out.println(BILIBILIAPI.Userid);
		}else {
			JOptionPane.showMessageDialog(null, "开发中");
		}
		
	}
}
