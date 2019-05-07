package com.bilibili;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.json.JsonData;

public class Action implements ActionListener{
	public void actionPerformed(ActionEvent event) {
		
		if (event.getActionCommand().equals("官方网站")) {
			JOptionPane.showMessageDialog(null, "http://-------------");
		}else if(event.getActionCommand().equals("个人中心")){
			JsonData js = new JsonData();
			int follower=js.getFollower();
			int folloing=js.getFollowings();
			JOptionPane.showMessageDialog(null, "粉丝数量:"+follower+"\n关注的人数:"+folloing);
		}
		
	}
}
